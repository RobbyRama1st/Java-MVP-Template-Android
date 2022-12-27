package com.sweet.cloves.mvptemplate.presentation.splash.impl;

import android.os.Handler;
import android.util.Log;

import com.sweet.cloves.mvptemplate.data.local.enums.LoggedInMode;
import com.sweet.cloves.mvptemplate.data.local.prefs.DataManager;
import com.sweet.cloves.mvptemplate.presentation.splash.SplashInteractor;
import com.sweet.cloves.mvptemplate.presentation.splash.SplashPresenter;

import javax.inject.Inject;

public class SplashInteractorImpl implements SplashInteractor {

    private int SPLASH_TIME_OUT = 3000;
    private DataManager mDataManager;

    @Inject
    public SplashInteractorImpl(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void toNextActivity() {
        int loggedInMode = mDataManager.getCurrentUserLoggedInMode();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//               switch (loggedInMode) {
//                   case DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT:
//                       Log.d("SplashInteractorImpl", "toNextActivity: LOGGED_IN_MODE_LOGGED_OUT");
//                       mSplashPresenter.openLoginActivity();
//                       break;
//                   case DataManager.LoggedInMode.LOGGED_IN_MODE_SERVER:
//                   case DataManager.LoggedInMode.LOGGED_IN_MODE_FB:
//                   case DataManager.LoggedInMode.LOGGED_IN_MODE_GOOGLE:
//                       Log.d("SplashInteractorImpl", "toNextActivity: LOGGED_IN_MODE_SERVER");
//                       mSplashPresenter.openMainActivity();
//                       break;
//               }
            }
        }, SPLASH_TIME_OUT);
    }
}
