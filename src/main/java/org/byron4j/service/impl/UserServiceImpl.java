package org.byron4j.service.impl;

import org.byron4j.mapper.UserMapper;
import org.byron4j.model.User;
import org.byron4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.queryById(id);
    }
}
