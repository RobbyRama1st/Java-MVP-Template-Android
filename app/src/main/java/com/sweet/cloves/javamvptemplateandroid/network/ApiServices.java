package com.sweet.cloves.javamvptemplateandroid.network;

import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.data.remote.response.LoginResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("/api/auth/login")
    Observable<LoginResponse> login(@Body LoginRequest request);

}
