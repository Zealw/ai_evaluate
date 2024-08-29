package com.evaluate.ai_evaluate.controller;

import com.evaluate.ai_evaluate.dao.UserMapper;
import com.evaluate.ai_evaluate.entity.R;
import com.evaluate.ai_evaluate.entity.User;
import com.evaluate.ai_evaluate.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@ControllerAdvice
@RestController
@RequestMapping("/ai")
@Slf4j

@Api(value = "主逻辑", tags = "主逻辑")
public class AIController {
    @Resource
    private UserService userService;


    @PostMapping("/test")
    @ApiOperation("测试")
    public R test(){
        List<User> users = userService.list();
        Long id = users.get(0).getId();
        return R.success("测试!" + id);
    }


}
