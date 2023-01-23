package com.sweet.cloves.javamvptemplateandroid;

import android.app.Application;

import androidx.annotation.NonNull;

import com.sweet.cloves.javamvptemplateandroid.di.app.AppComponent;
import com.sweet.cloves.javamvptemplateandroid.di.app.AppModule;
import com.sweet.cloves.javamvptemplateandroid.di.app.DaggerAppComponent;

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
