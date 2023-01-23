package com.sweet.cloves.javamvptemplateandroid.presentation.base.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.appcompat.app.AppCompatActivity;

import com.sweet.cloves.javamvptemplateandroid.MyApp;
import com.sweet.cloves.javamvptemplateandroid.di.app.AppComponent;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.BasePresenter;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.PresenterFactory;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.PresenterLoader;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseActivity<P extends BasePresenter<V>, V> extends AppCompatActivity implements LoaderManager.LoaderCallbacks<P>
{
    /**
     * Is this the first start of the activity (after onCreate)
     */
    private boolean mFirstStart;
    /**
     * The presenter for this view
     */
    @Nullable
    protected P mPresenter;
    /**
     * Do we need to call {@link #doStart()} from the {@link #onLoadFinished(Loader, BasePresenter)} method.
     * Will be true if presenter wasn't loaded when {@link #onStart()} is reached
     */
    private final AtomicBoolean mNeedToCallStart = new AtomicBoolean(false);


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mFirstStart = true;

        injectDependencies();

        LoaderManager.getInstance(this).initLoader(0, null, this).startLoading();
    }

    private void injectDependencies()
    {
        setupComponent(((MyApp) getApplication()).getAppComponent());
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        if( mPresenter == null ) {
            mNeedToCallStart.set(true);
        } else {
            doStart();
        }
    }

    /**
     * Call the presenter callbacks for onStart
     */
    @SuppressWarnings("unchecked")
    private void doStart() {
        assert mPresenter != null;

        mPresenter.onViewAttached((V) this);

        mPresenter.onStart(mFirstStart);

        mFirstStart = false;
    }

    @Override
    protected void onStop()
    {
        if( mPresenter != null )
        {
            mPresenter.onStop();

            mPresenter.onViewDetached();
        }

        super.onStop();
    }

    @NonNull
    @Override
    public final Loader<P> onCreateLoader(int id, Bundle args)
    {
        return new PresenterLoader<>(this, getPresenterFactory());
    }

    @Override
    public final void onLoadFinished(@NonNull Loader<P> loader, P presenter)
    {
        mPresenter = presenter;

        if( mNeedToCallStart.compareAndSet(true, false) )
        {
            doStart();
        }
    }

    @Override
    public final void onLoaderReset(@NonNull Loader<P> loader)
    {
        mPresenter = null;
    }

    /**
     * Get the presenter factory implementation for this view
     *
     * @return the presenter factory
     */
    @NonNull
    protected abstract PresenterFactory<P> getPresenterFactory();

    /**
     * Setup the injection component for this view
     *
     * @param appComponent the app component
     */
    protected abstract void setupComponent(@NonNull AppComponent appComponent);
}
