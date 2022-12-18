package com.sweet.cloves.mvptemplate.di.app;

import android.content.Context;

import com.sweet.cloves.mvptemplate.MyApp;
import com.sweet.cloves.mvptemplate.data.AppRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    Context getContext();
    MyApp getMyApp();
    AppRepository getAppRepository();
}
