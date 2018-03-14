package com.hzslb.service;

import com.hzslb.model.User;

import java.util.List;
public interface UserService {
    List<User> list();

    boolean add(User user);

    boolean remove(User user);
}
