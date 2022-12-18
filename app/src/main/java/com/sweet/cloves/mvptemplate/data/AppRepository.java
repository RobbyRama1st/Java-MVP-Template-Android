package com.sweet.cloves.mvptemplate.data;

import com.sweet.cloves.mvptemplate.data.remote.model.LoginResponse;

import io.reactivex.rxjava3.core.Observable;

public interface AppRepository {
    Observable<LoginResponse> login(String email, String password);
}
