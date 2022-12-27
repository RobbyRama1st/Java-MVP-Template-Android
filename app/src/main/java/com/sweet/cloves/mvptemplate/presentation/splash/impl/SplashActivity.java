package com.sweet.cloves.mvptemplate.presentation.splash.impl;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.R;
import com.sweet.cloves.mvptemplate.di.app.AppComponent;
import com.sweet.cloves.mvptemplate.di.splash.SplashComponent;
import com.sweet.cloves.mvptemplate.presentation.base.PresenterFactory;
import com.sweet.cloves.mvptemplate.presentation.splash.SplashPresenter;
import com.sweet.cloves.mvptemplate.presentation.splash.SplashView;
import com.sweet.cloves.mvptemplate.presentation.base.impl.BaseActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends BaseActivity<SplashPresenter, SplashView> implements SplashView {

    PresenterFactory<SplashPresenter> presenterFactory;
    SplashComponent splashViewComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @NonNull
    @Override
    protected PresenterFactory<SplashPresenter> getPresenterFactory() {
        return presenterFactory;
    }

    @Override
    protected void setupComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public void toNextActivity() {

    }
}
