package com.sweet.cloves.javamvptemplateandroid.presentation.base;

import androidx.annotation.NonNull;


/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter>
{
    @NonNull
    T create();
}