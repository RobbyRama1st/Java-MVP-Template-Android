package com.sweet.cloves.mvptemplate.data.local.prefs;

import android.content.SharedPreferences;

import com.sweet.cloves.mvptemplate.data.local.enums.LoggedInMode;

import javax.inject.Inject;

public class SharedPrefsHelper {

    public static final String PREF_NAME = "MAIN_PREF";
    public static final String PREF_KEY_TIME_LAUNCH = "IsFirstTimeLaunch";
    public static final String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    public static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    public static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
    public static final String PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
    public static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    public static final String PREF_KEY_CURRENT_USER_PROFILE_PIC_URL = "PREF_KEY_CURRENT_USER_PROFILE_PIC_URL";
    public static final String PREF_KEY_CURRENT_USER_LOGGED_IN_MODE = "PREF_KEY_CURRENT_USER_LOGGED_IN_MODE";

    private final SharedPreferences mSharedPreferences;

    @Inject
    public SharedPrefsHelper(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void setEmail(String email) {
        mSharedPreferences.edit().putString(PREF_KEY_CURRENT_USER_EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(PREF_KEY_CURRENT_USER_EMAIL, null);
    }

    public void setLoggedInMode(LoggedInMode mode) {
        mSharedPreferences.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getType()).apply();
    }

    public int getLoggedInMode() {
        return mSharedPreferences.getInt(PREF_KEY_USER_LOGGED_IN_MODE, LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType());
    }

}
