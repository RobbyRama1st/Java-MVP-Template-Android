package com.sweet.cloves.mvptemplate.data;

import com.sweet.cloves.mvptemplate.data.remote.request.LoginRequest;
import com.sweet.cloves.mvptemplate.data.remote.response.LoginResponse;

import io.reactivex.rxjava3.core.Observable;

public interface AppRepository {

    Observable<LoginResponse> login(LoginRequest request);
}
