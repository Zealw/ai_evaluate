package com.evaluate.ai_evaluate.service.impl;

import com.evaluate.ai_evaluate.dto.PicDTO;
import com.evaluate.ai_evaluate.entity.TextTemplate;
import com.evaluate.ai_evaluate.mapper.TextTemplateMapper;
import com.evaluate.ai_evaluate.mapper.UserMapper;
import com.evaluate.ai_evaluate.service.AIService;
import com.evaluate.ai_evaluate.service.TextTemplateService;
import com.evaluate.ai_evaluate.utils.BigModelNew;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIServiceImpl implements AIService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TextTemplateService textTemplateService;

    @Autowired
    private TextTemplateMapper textTemplateMapper;



    @Override
    @SneakyThrows
    public String[] getEvaluation(PicDTO picDTO) {
        String text = "假如你是顾客,";
        String evType = textTemplateMapper.getByKeyEV(picDTO.getTemplateKey());
        text += picDTO.getFontNumberMin() + "-" + picDTO.getFontNumberMax() + "字,";
        text += evType + ",";
        text += picDTO.getRemark();
        text += "评价";
        BigModelNew bigModelNew = new BigModelNew();
        return bigModelNew.getEvaluation(picDTO.getPics(),text);
    }

}
