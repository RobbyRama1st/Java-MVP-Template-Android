package com.sweet.cloves.javamvptemplateandroid.di.login;

import com.sweet.cloves.javamvptemplateandroid.repository.AppRepository;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginInteractor;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginPresenter;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.LoginView;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.impl.LoginInteractorImpl;
import com.sweet.cloves.javamvptemplateandroid.presentation.login.impl.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public final class LoginModule {

    @Provides
    LoginView provideLoginView(LoginView loginView) {
        return loginView;
    }

    @Provides
    LoginPresenter provideLoginPresenter(LoginView view, AppRepository repository) {
        return new LoginPresenterImpl(view, repository);
    }

    @Provides
    LoginInteractor provideLoginInteractor(AppRepository repository) {
        return new LoginInteractorImpl(repository);
    }
}
