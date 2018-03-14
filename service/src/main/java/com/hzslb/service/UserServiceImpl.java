package com.hzslb.service;

import com.hzslb.model.User;
import com.hzslb.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public boolean add(User user) {
        User suser = userRepository.save(user);
        if (suser != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean remove(User user) {
        try {
        userRepository.delete(user);
        return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
