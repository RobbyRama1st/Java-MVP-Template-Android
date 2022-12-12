package com.sweet.cloves.mvptemplate.presentation.login;

import com.sweet.cloves.mvptemplate.presentation.base.BaseInteractor;

public interface LoginInteractor extends BaseInteractor {

    void login(String email, String password, ValidatorInputListener validatorInputListener, OnFinishedLoginListener onFinishedoginListener);

    interface ValidatorInputListener{

    }

    interface OnFinishedLoginListener {

    }
}
