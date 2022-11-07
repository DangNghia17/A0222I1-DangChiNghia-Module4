package com.nghia.service;

import com.nghia.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void save(User user);
}
