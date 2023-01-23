package com.sweet.cloves.javamvptemplateandroid.di.login;

import com.sweet.cloves.javamvptemplateandroid.di.PerActivity;
import com.sweet.cloves.javamvptemplateandroid.di.app.AppComponent;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.impl.LoginActivity;

import dagger.Component;

@PerActivity
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
