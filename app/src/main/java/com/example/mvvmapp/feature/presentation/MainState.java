package com.example.mvvmapp.feature.presentation;

import androidx.annotation.NonNull;

import com.example.mvvmapp.feature.model.LoadingStatus;

public class MainState {

    private LoadingStatus status;
    private String text;

    public LoadingStatus getStatus() {
        return status;
    }

    public void setStatus(LoadingStatus status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
