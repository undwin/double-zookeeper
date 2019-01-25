package com.dubbo.generator.service;

import com.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(String userName) {
        return "generator:"+userName;
    }
}
