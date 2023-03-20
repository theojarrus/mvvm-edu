package com.example.mvvmapp.domain.interactor;

import com.example.mvvmapp.domain.model.User;
import com.example.mvvmapp.domain.repository.UsersRepository;

import java.util.List;

public class UsersInteractor {

    public static List<User> provideProcessedUsers() {
        return UsersRepository.getUsers();
    }
}
