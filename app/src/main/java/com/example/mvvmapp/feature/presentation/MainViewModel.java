package com.example.mvvmapp.feature.presentation;

import android.os.Looper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmapp.domain.interactor.UsersInteractor;
import com.example.mvvmapp.domain.model.User;
import com.example.mvvmapp.domain.repository.UsersRepository;

import java.util.List;

public class MainViewModel extends ViewModel {

    private MutableLiveData<MainState> _state = new MutableLiveData<>();
    public LiveData<MainState> state = _state;

    public void load() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(i);
                }
                // Check is current thread main thread
                MainState tempState = state.getValue(); // clone
                if (tempState != null) tempState.setText("Custom Text");
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    _state.setValue(tempState);
                } else {
                    _state.postValue(tempState);
                }
            }
        }.start();
    }

    public void loadUsers() {
        List<User> users = UsersInteractor.provideProcessedUsers();
    }
}
