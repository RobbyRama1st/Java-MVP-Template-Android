package com.sweet.cloves.mvptemplate.di.login;

import com.sweet.cloves.mvptemplate.di.PerActivity;
import com.sweet.cloves.mvptemplate.di.app.AppComponent;
import com.sweet.cloves.mvptemplate.presentation.login.impl.LoginActivity;

import dagger.Component;

@PerActivity
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
