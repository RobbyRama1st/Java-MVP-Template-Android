package com.sweet.cloves.mvptemplate.presentation.login.impl;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.presentation.login.LoginInteractor;
import com.sweet.cloves.mvptemplate.presentation.login.LoginView;
import com.sweet.cloves.mvptemplate.presentation.login.LoginPresenter;

public class LoginPresenterImpl implements LoginPresenter {

    LoginView loginView;
    LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView, LoginInteractor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void login(String username, String password) {
        loginView.showLoading("Please wait...");
    }


    @Override
    public void onViewAttached(@NonNull LoginView view) {

    }

    @Override
    public void onStart(boolean viewCreated) {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onViewDetached() {

    }

    @Override
    public void onPresenterDestroyed() {

    }
}
