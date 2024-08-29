package com.evaluate.ai_evaluate.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.evaluate.ai_evaluate.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
