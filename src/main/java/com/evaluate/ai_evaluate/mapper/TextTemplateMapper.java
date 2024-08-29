package com.evaluate.ai_evaluate.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.evaluate.ai_evaluate.entity.TextTemplate;
import org.apache.ibatis.annotations.Select;

/**
 * (TextTemplate)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-29 15:46:59
 */
public interface TextTemplateMapper extends BaseMapper<TextTemplate> {

    @Select("select * from text_template where code = #{code} and is_delete = '0'")
    List<TextTemplate> getByCode(@Param("code") String code);
    @Select("select value from text_template where code = 'ev_type' and is_delete = '0' and key = #{key} limit 1")
    String getByKeyEV(@Param("key") String key);


}

