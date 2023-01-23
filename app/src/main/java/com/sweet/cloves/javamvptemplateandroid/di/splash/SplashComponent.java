package com.sweet.cloves.javamvptemplateandroid.di.splash;

import com.sweet.cloves.javamvptemplateandroid.di.PerActivity;
import com.sweet.cloves.javamvptemplateandroid.di.app.AppComponent;
import com.sweet.cloves.javamvptemplateandroid.presentation.splash.impl.SplashActivity;

import dagger.Component;

@PerActivity
@Component(modules = SplashModule.class, dependencies = AppComponent.class)
public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
