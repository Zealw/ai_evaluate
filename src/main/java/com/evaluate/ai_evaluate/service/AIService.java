package com.evaluate.ai_evaluate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evaluate.ai_evaluate.dto.PicDTO;
import com.evaluate.ai_evaluate.entity.TextTemplate;

import java.util.List;

/**
 * (TextTemplate)表服务接口
 *
 * @author makejava
 * @since 2024-08-29 15:46:59
 */
public interface AIService {

    String[] getEvaluation(PicDTO picDTO);
}

