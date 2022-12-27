package com.sweet.cloves.mvptemplate.presentation.login.impl;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.data.AppRepository;
import com.sweet.cloves.mvptemplate.data.remote.request.LoginRequest;
import com.sweet.cloves.mvptemplate.presentation.login.LoginInteractor;
import com.sweet.cloves.mvptemplate.presentation.login.LoginView;
import com.sweet.cloves.mvptemplate.presentation.login.LoginPresenter;

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnFinishedLoginListener {

    private LoginView mView;
    private AppRepository mRepository;
    private LoginInteractor mInteractor;

    public LoginPresenterImpl(@NonNull LoginView view, @NonNull AppRepository repository) {
        this.mView = view;
        this.mRepository = repository;
        this.mInteractor = new LoginInteractorImpl(repository);
        this.mInteractor.setOnFinishedLoginListener(this);
    }

    @Override
    public void login(LoginRequest request) {
        this.mView.showLoading("Logging in...");
        this.mInteractor.login(request);
    }

    @Override
    public void onViewAttached(@NonNull LoginView view) {
        this.mView = view;
    }

    @Override
    public void onStart(boolean viewCreated) {
        // Perform any initialization tasks her
    }

    @Override
    public void onStop() {

    }

    @Override
    public void onViewDetached() {
        this.mView = null;
    }

    @Override
    public void onPresenterDestroyed() {

    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFailed() {

    }
}
