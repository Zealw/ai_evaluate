package com.evaluate.ai_evaluate.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evaluate.ai_evaluate.entity.TextTemplate;
import com.evaluate.ai_evaluate.mapper.TextTemplateMapper;
import com.evaluate.ai_evaluate.mapper.UserMapper;
import com.evaluate.ai_evaluate.entity.User;
import com.evaluate.ai_evaluate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
       return userMapper.selectList(null);
    }
}
