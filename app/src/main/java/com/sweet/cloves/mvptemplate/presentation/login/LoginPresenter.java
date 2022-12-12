package com.sweet.cloves.mvptemplate.presentation.login;

import com.sweet.cloves.mvptemplate.presentation.base.BasePresenter;

public interface LoginPresenter extends BasePresenter<LoginView> {
    void login(String username, String password);
}
