package com.sweet.cloves.mvptemplate.presentation.login;

import com.sweet.cloves.mvptemplate.presentation.base.BaseView;

public interface LoginView extends BaseView {
   void loginSuccess(String message);
   void loginFailure(String  message);
}
