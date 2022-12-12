package com.sweet.cloves.mvptemplate.network;

import com.sweet.cloves.mvptemplate.data.model.Users;

import retrofit2.Callback;
import retrofit2.http.POST;

public interface APIService {

    @POST("/api/auth/register")
    void register(Callback<Users> callback);

    @POST("/api/auth/login")
    void login(Callback<Users> callback);
}
