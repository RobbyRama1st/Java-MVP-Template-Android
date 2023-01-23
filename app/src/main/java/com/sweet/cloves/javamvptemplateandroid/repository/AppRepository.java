package com.sweet.cloves.javamvptemplateandroid.repository;

import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.data.remote.response.LoginResponse;

import io.reactivex.rxjava3.core.Observable;

public interface AppRepository {

    Observable<LoginResponse> login(LoginRequest request);
}
