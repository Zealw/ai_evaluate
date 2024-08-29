package com.evaluate.ai_evaluate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evaluate.ai_evaluate.entity.TextTemplate;
import com.evaluate.ai_evaluate.service.TextTemplateService;
import com.evaluate.ai_evaluate.mapper.TextTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TextTemplate)表服务实现类
 *
 * @author makejava
 * @since 2024-08-29 15:46:59
 */
@Service("textTemplateService")
public class TextTemplateServiceImpl extends ServiceImpl<TextTemplateMapper, TextTemplate> implements TextTemplateService {
    @Autowired
    private TextTemplateMapper textTemplateMapper;

    @Override
    public List<TextTemplate> getByCode(String code) {
        return textTemplateMapper.getByCode(code);
    }
}

