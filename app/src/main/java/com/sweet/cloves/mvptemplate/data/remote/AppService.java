package com.sweet.cloves.mvptemplate.data.remote;

import com.sweet.cloves.mvptemplate.data.remote.request.LoginRequest;
import com.sweet.cloves.mvptemplate.data.remote.response.LoginResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AppService {

    @POST("/api/auth/login")
    Observable<LoginResponse> login(@Body LoginRequest request);

}
