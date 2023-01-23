package com.sweet.cloves.javamvptemplateandroid.presentation.login;

import com.sweet.cloves.javamvptemplateandroid.presentation.base.BaseView;

public interface LoginView extends BaseView {
   void loginSuccess(String message);
   void loginFailed(String message);
}
