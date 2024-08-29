package com.evaluate.ai_evaluate.controller;

import com.evaluate.ai_evaluate.dto.PicDTO;
import com.evaluate.ai_evaluate.entity.R;
import com.evaluate.ai_evaluate.entity.User;
import com.evaluate.ai_evaluate.service.AIService;
import com.evaluate.ai_evaluate.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@ControllerAdvice
@RestController
@RequestMapping("/ai")
@Slf4j

@Api(value = "主逻辑", tags = "主逻辑")
public class AIController {
    @Resource
    private UserService userService;

    @Resource
    private AIService aiService;


    @PostMapping("/test")
    @ApiOperation("测试")
    public R test(){
        List<User> users = userService.list();
        Long id = users.get(0).getId();
        return R.success("测试!" + id);
    }

    @PostMapping("/getMsgByPics")
    @ApiOperation("根据图片获取评价")
    public R getMsgByPics(@RequestParam("pics") List<MultipartFile> pics,@RequestParam("fontNumberMin") int fontNumberMin,@RequestParam("fontNumberMax") int fontNumberMax,@RequestParam("templateKey")String templateKey,@RequestParam("remark")String remark){
        PicDTO picDTO = new PicDTO(pics,fontNumberMin,fontNumberMax,templateKey,remark);
        String[] evaluation = aiService.getEvaluation(picDTO);
        return R.data(evaluation);
    }


}
