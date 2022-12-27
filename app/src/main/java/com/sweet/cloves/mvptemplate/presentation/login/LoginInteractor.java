package com.sweet.cloves.mvptemplate.presentation.login;

import com.sweet.cloves.mvptemplate.data.remote.request.LoginRequest;
import com.sweet.cloves.mvptemplate.presentation.base.BaseInteractor;

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
