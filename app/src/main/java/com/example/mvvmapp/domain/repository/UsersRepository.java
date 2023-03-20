package com.example.mvvmapp.domain.repository;

import com.example.mvvmapp.domain.model.User;
import com.example.mvvmapp.mock.Database;

import java.util.Arrays;
import java.util.List;

public class UsersRepository {

    private Database database; // = Database.getInstance();

    public static List<User> getUsers() {
        // return database.getUsers();
        return Arrays.asList(new User(), new User());
    }
}
