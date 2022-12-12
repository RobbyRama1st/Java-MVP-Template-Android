package com.sweet.cloves.mvptemplate.presentation.base.impl;

import com.sweet.cloves.mvptemplate.presentation.base.BaseInteractor;

public abstract class BaseInteractorImpl<V> implements BaseInteractor<V>{

    @Override
    public void setUserAsLoggedOut(){

    }

    @Override
    public void setAccessToken(String accessToken) {

    }

    @Override
    public void updateApiHeader(Long userId, String accessToken) {

    }
}
