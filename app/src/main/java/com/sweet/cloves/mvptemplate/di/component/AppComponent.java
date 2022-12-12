package com.sweet.cloves.mvptemplate.di.component;

import android.content.Context;

import com.sweet.cloves.mvptemplate.MyApp;
import com.sweet.cloves.mvptemplate.di.module.AppModule;
import com.sweet.cloves.mvptemplate.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    Context getAppContext();
    MyApp getMyApp();
}
