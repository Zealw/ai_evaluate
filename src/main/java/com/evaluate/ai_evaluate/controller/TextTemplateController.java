package com.evaluate.ai_evaluate.controller;

import com.evaluate.ai_evaluate.entity.R;
import com.evaluate.ai_evaluate.service.TextTemplateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TextTemplate)表控制层
 *
 * @author makejava
 * @since 2024-08-29 15:46:59
 */
@RestController
@RequestMapping("textTemplate")
public class TextTemplateController{
    /**
     * 服务对象
     */
    @Resource
    private TextTemplateService textTemplateService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("getByCode")
    public R getByCode(String code) {
        return R.data(this.textTemplateService.getByCode(code));
    }

}

