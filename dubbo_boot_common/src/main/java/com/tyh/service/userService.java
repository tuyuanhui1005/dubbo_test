package com.tyh.service;

import com.tyh.model.user;

public interface userService {

    int addUser(user user);

    user getUser(String id);

}
