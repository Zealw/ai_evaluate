package com.evaluate.ai_evaluate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (TextTemplate)表实体类
 *
 * @author makejava
 * @since 2024-08-29 15:46:59
 */
@Data
@TableName("text_template")
@EqualsAndHashCode()
@ApiModel(value = "text_template", description = "模版表")
public class TextTemplate {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField(value = "code")
    private String code;
    @TableField(value = "key")
    private String key;
    @TableField(value = "value")
    private String value;
    @TableField(value = "is_delete")
    private Integer isDelete;


}

