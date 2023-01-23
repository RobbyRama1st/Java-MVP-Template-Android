package com.sweet.cloves.javamvptemplateandroid.presentation.login;

import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.BasePresenter;

public interface LoginPresenter extends BasePresenter<LoginView> {
    void login(LoginRequest request);
}
