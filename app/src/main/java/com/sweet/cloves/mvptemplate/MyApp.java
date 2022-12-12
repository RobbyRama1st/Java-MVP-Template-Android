package com.sweet.cloves.mvptemplate;

import android.app.Application;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.di.component.AppComponent;
import com.sweet.cloves.mvptemplate.di.component.DaggerAppComponent;
import com.sweet.cloves.mvptemplate.di.module.AppModule;

public class MyApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return appComponent;
    }
}
