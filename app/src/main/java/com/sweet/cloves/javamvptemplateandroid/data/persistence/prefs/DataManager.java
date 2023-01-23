package com.sweet.cloves.javamvptemplateandroid.data.persistence.prefs;


import com.sweet.cloves.javamvptemplateandroid.data.persistence.enums.LoggedInMode;

import javax.inject.Inject;

public class DataManager {
    private final SharedPrefsHelper mSharedPrefsHelper;

    @Inject
    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email) {
        mSharedPrefsHelper.setEmail(email);
    }

    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(LoggedInMode.LOGGED_IN_MODE_SERVER);
    }

    public void setLoggedOut() {
        mSharedPrefsHelper.setLoggedInMode(LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT);
    }

    public int getCurrentUserLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
