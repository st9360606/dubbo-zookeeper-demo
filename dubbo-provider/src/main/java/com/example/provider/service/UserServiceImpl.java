package com.example.provider.service;

import com.example.api.User;
import com.example.api.UserServiceI;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0")
public class UserServiceImpl implements UserServiceI {
    @Override
    public User selectUserById(Integer id) {
        User user =new User();
        user.setId(id);
        user.setName("kurt");
        return user;
    }
}
