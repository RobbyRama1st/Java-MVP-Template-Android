package com.sweet.cloves.mvptemplate.presentation.base;

import androidx.annotation.StringRes;

public interface BaseView {
    void showLoading(String msg);
    void hideLoading();
    void onCompleted();
    void onError(@StringRes int resId);
    void onError(String message);
    void showMessage(String message);
    void showMessage(@StringRes int resId);
    boolean isNetworkConnected();
    void hideKeyboard();
}
