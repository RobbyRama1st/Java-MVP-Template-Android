package com.sweet.cloves.mvptemplate.presentation.base.impl;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import com.sweet.cloves.mvptemplate.MyApp;
import com.sweet.cloves.mvptemplate.di.component.AppComponent;
import com.sweet.cloves.mvptemplate.presentation.base.BasePresenter;
import com.sweet.cloves.mvptemplate.presentation.base.PresenterFactory;
import com.sweet.cloves.mvptemplate.presentation.base.PresenterLoader;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseFragment<P extends BasePresenter<V>, V> extends Fragment implements LoaderManager.LoaderCallbacks<P>
{
    /**
     * The presenter for this view
     */
    @Nullable
    protected P mPresenter;
    /**
     * Is this the first start of the fragment (after onCreate)
     */
    private boolean mFirstStart;
    /**
     * Do we need to call {@link #doStart()} from the {@link #onLoadFinished(Loader, BasePresenter)} method.
     * Will be true if presenter wasn't loaded when {@link #onStart()} is reached
     */
    private final AtomicBoolean mNeedToCallStart = new AtomicBoolean(false);

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mFirstStart = true;

        injectDependencies();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        LoaderManager.getInstance(this).initLoader(0, null, this).startLoading();
    }

    private void injectDependencies()
    {
        setupComponent(((MyApp) requireActivity().getApplication()).getAppComponent());
    }

    @Override
    public void onStart()
    {
        super.onStart();

        if( mPresenter == null )
        {
            mNeedToCallStart.set(true);
        }
        else
        {
            doStart();
        }
    }

    /**
     * Call the presenter callbacks for onStart
     */
    @SuppressWarnings("unchecked")
    private void doStart()
    {
        assert mPresenter != null;

        mPresenter.onViewAttached((V) this);

        mPresenter.onStart(mFirstStart);

        mFirstStart = false;
    }

    @Override
    public void onStop()
    {
        if( mPresenter != null )
        {
            mPresenter.onStop();

            mPresenter.onViewDetached();
        }

        super.onStop();
    }

    @Override
    public final Loader<P> onCreateLoader(int id, Bundle args)
    {
        return new PresenterLoader<>(getActivity(), getPresenterFactory());
    }

    @Override
    public final void onLoadFinished(Loader<P> loader, P presenter)
    {
        mPresenter = presenter;

        if( mNeedToCallStart.compareAndSet(true, false) )
        {
            doStart();
        }
    }

    @Override
    public final void onLoaderReset(Loader<P> loader)
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
