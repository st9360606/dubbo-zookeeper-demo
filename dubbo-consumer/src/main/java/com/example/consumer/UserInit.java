package com.example.consumer;

import com.example.api.UserServiceI;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {

    @Reference(version = "1.0")
    private UserServiceI userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.selectUserById(2));
    }
}
