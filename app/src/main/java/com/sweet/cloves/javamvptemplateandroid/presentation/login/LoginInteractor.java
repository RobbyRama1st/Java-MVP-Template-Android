package com.sweet.cloves.javamvptemplateandroid.presentation.login;

import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.BaseInteractor;

public interface LoginInteractor extends BaseInteractor {

    void login(LoginRequest request);

    void setOnFinishedLoginListener(OnFinishedLoginListener listener);

    void setValidatorInputListener(LoginInputListener listener);

    interface LoginInputListener {
        void onEmailError();
        void onPasswordError();
    }

    interface OnFinishedLoginListener {
        void onLoginSuccess();
        void onLoginFailed();
    }
}
