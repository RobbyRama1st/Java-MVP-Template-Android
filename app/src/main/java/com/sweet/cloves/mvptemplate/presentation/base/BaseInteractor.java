package com.sweet.cloves.mvptemplate.presentation.base;

public interface BaseInteractor<V> {
    void setUserAsLoggedOut();
    void setAccessToken(String accessToken);
    void updateApiHeader(Long userId, String accessToken);
}
