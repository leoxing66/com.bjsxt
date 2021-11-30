package com.bjsxt.service;

import com.bjsxt.entity.User;

public interface UserService {

    void pay();

    User login(String name, String pwd);

    int save(String name, String pwd);

    int save(User user);

}
