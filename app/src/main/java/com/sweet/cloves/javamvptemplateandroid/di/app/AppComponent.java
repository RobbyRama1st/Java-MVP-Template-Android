package com.sweet.cloves.javamvptemplateandroid.di.app;

import android.content.Context;

import com.sweet.cloves.javamvptemplateandroid.MyApp;
import com.sweet.cloves.javamvptemplateandroid.repository.AppRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    Context getContext();
    MyApp getMyApp();
    AppRepository getAppRepository();
}
