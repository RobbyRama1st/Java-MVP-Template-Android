package com.sweet.cloves.javamvptemplateandroid.presentation.login.impl;

import android.text.TextUtils;

import com.sweet.cloves.javamvptemplateandroid.repository.AppRepository;
import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginInteractor;

public class LoginInteractorImpl implements LoginInteractor {

    AppRepository mLoginRepository;
    LoginInputListener mLoginInputListener;
    OnFinishedLoginListener mOnFinishedLoginListener;

    public LoginInteractorImpl(AppRepository loginRepository) {
        this.mLoginRepository = loginRepository;
    }

    @Override
    public void login(LoginRequest request) {
        if (TextUtils.isEmpty(request.getEmail())) {
            mLoginInputListener.onEmailError();
            return;
        }
        if (TextUtils.isEmpty(request.getPassword())) {
            mLoginInputListener.onPasswordError();
            return;
        }
        mLoginRepository.login(request);
    }

    @Override
    public void setOnFinishedLoginListener(OnFinishedLoginListener listener) {
        this.mOnFinishedLoginListener = listener;
    }

    @Override
    public void setValidatorInputListener(LoginInputListener listener) {
        this.mLoginInputListener = listener;
    }

}
