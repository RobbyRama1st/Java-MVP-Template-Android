package com.sweet.cloves.mvptemplate.presentation.base.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sweet.cloves.mvptemplate.presentation.base.BasePresenter;

/**
 * Abstract presenter implementation that contains base implementation for other presenters.
 * Subclasses must call super for all {@link BasePresenter} method overriding.
 */
public class BasePresenterImpl<V> implements BasePresenter<V> {

    private V view;

    @Override
    public void onViewAttached(@NonNull V view) {
        this.view = view;
    }

    @Override
    public void onStart(boolean viewCreated) {
        // Aktivitas yang akan dilakukan saat objek Presenter dimulai, misalnya mengambil data dari Model
    }

    @Override
    public void onStop() {
        // Aktivitas yang akan dilakukan saat objek Presenter dihentikan, misalnya menghentikan operasi asinkron
    }

    @Override
    public void onViewDetached() {
        this.view = null;
    }

    @Override
    public void onPresenterDestroyed() {
        // Aktivitas yang akan dilakukan saat objek Presenter dihapus, misalnya menghapus referensi ke objek Model
    }

    protected V getView() {
        return view;
    }
}