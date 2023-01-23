package com.sweet.cloves.javamvptemplateandroid.repository;

import com.sweet.cloves.javamvptemplateandroid.data.remote.request.LoginRequest;
import com.sweet.cloves.javamvptemplateandroid.data.remote.response.LoginResponse;
import com.sweet.cloves.javamvptemplateandroid.network.ApiServices;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Retrofit;

public class AppRepositoryImpl implements AppRepository {

    ApiServices services;

    public AppRepositoryImpl(Retrofit retrofit) {
        this.services = retrofit.create(ApiServices.class);
    }

    @Override
    public Observable<LoginResponse> login(LoginRequest request) {
        return services.login(request);
    }
}
