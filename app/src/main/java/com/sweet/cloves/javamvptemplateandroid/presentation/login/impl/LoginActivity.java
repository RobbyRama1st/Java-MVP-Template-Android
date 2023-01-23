package com.sweet.cloves.javamvptemplateandroid.presentation.login.impl;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.sweet.cloves.javamvptemplateandroid.R;
import com.sweet.cloves.javamvptemplateandroid.di.app.AppComponent;
import com.sweet.cloves.javamvptemplateandroid.di.login.DaggerLoginComponent;
import com.sweet.cloves.javamvptemplateandroid.di.login.LoginModule;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginPresenter;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginView;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.PresenterFactory;
import com.sweet.cloves.javamvptemplateandroid.presentation.base.impl.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter, LoginView> implements LoginView {

    LoginPresenter mLoginPresenter;

    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private TextView mForgotPasswordTextView;
    private TextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void setupComponent(@NonNull AppComponent appComponent) {
        DaggerLoginComponent.builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<LoginPresenter> getPresenterFactory() {
        return () -> mLoginPresenter;
    }

    @Override
    public void loginSuccess(String message) {

    }

    @Override
    public void loginFailed(String message) {

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
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {
        // Show a message
    }

    @Override
    public void showMessage(int resId) {
        // Show a message
    }

    @Override
    public boolean isNetworkConnected() {
        // Check if the device is connected to the internet
        return false;
    }

    @Override
    public void hideKeyboard() {
        // Hide the keyboard
    }
}
