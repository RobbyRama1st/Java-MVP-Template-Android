package com.sweet.cloves.mvptemplate.di.splash;

import com.sweet.cloves.mvptemplate.di.PerActivity;
import com.sweet.cloves.mvptemplate.di.app.AppComponent;
import com.sweet.cloves.mvptemplate.presentation.splash.impl.SplashActivity;

import dagger.Component;

@PerActivity
@Component(modules = SplashModule.class, dependencies = AppComponent.class)
public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
