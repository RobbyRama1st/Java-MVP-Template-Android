package com.sweet.cloves.mvptemplate;

import android.app.Application;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.di.app.AppComponent;
import com.sweet.cloves.mvptemplate.di.app.AppModule;
import com.sweet.cloves.mvptemplate.di.app.DaggerAppComponent;

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
