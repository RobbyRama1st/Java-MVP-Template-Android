package com.sweet.cloves.mvptemplate.data;

import com.sweet.cloves.mvptemplate.data.remote.model.LoginResponse;
import com.sweet.cloves.mvptemplate.data.remote.AppService;
import com.sweet.cloves.mvptemplate.data.remote.model.ResultUsers;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Retrofit;

public class AppRepositoryImpl implements AppRepository {

    AppService appService;

    public AppRepositoryImpl(Retrofit retrofit) {
        this.appService = retrofit.create(AppService.class);
    }

    @Override
    public Observable<LoginResponse> login(String email, String password) {
        return appService.login(email, password);
    }
}
