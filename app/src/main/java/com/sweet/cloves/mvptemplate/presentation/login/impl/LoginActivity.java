package com.sweet.cloves.mvptemplate.presentation.login.impl;

import androidx.annotation.NonNull;

import com.sweet.cloves.mvptemplate.di.app.AppComponent;
import com.sweet.cloves.mvptemplate.presentation.login.LoginPresenter;
import com.sweet.cloves.mvptemplate.presentation.login.LoginView;
import com.sweet.cloves.mvptemplate.presentation.base.PresenterFactory;
import com.sweet.cloves.mvptemplate.presentation.base.impl.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter, LoginView> implements LoginView{

    PresenterFactory<LoginPresenter> presenterFactory;

    @NonNull
    @Override
    protected PresenterFactory<LoginPresenter> getPresenterFactory() {
        return presenterFactory;
    }

    @Override
    protected void setupComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public void loginSuccess(String message) {

    }

    @Override
    public void loginFailure(String message) {

    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void hideKeyboard() {

    }
}
