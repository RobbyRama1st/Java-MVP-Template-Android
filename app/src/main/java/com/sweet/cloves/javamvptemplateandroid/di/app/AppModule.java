package com.sweet.cloves.javamvptemplateandroid.di.app;

import android.content.Context;

import androidx.annotation.NonNull;

import com.sweet.cloves.javamvptemplateandroid.MyApp;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.migration.DisableInstallInCheck;

@Module
@DisableInstallInCheck
public final class AppModule {

    @NonNull
    private final MyApp myApp;

    public AppModule(@NonNull MyApp myApp) {
        this.myApp = myApp;
    }

    @Provides
    public Context provideAppContext(){
        return myApp;
    }

    @Provides
    public MyApp provideApp(){
        return myApp;
    }
}
