package com.evaluate.ai_evaluate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.evaluate.ai_evaluate.dao.UserMapper;
import com.evaluate.ai_evaluate.entity.User;
import com.evaluate.ai_evaluate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
       return userMapper.selectList(null);
    }
}
