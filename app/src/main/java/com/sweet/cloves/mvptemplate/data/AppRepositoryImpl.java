package com.sweet.cloves.mvptemplate.data;

import com.sweet.cloves.mvptemplate.data.remote.request.LoginRequest;
import com.sweet.cloves.mvptemplate.data.remote.response.LoginResponse;
import com.sweet.cloves.mvptemplate.data.remote.AppService;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Retrofit;

public class AppRepositoryImpl implements AppRepository {

    AppService appService;

    public AppRepositoryImpl(Retrofit retrofit) {
        this.appService = retrofit.create(AppService.class);
    }

    @Override
    public Observable<LoginResponse> login(LoginRequest request) {
        return appService.login(request);
    }
}
