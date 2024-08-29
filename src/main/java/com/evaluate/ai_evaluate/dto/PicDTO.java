package com.evaluate.ai_evaluate.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode()
@NoArgsConstructor
@AllArgsConstructor
public class PicDTO implements Serializable {

    @ApiModelProperty(value = "图片")
    private List<MultipartFile> pics;

    @ApiModelProperty(value = "最小字数")
    private int fontNumberMin;

    @ApiModelProperty(value = "最大字数")
    private int fontNumberMax;

    @ApiModelProperty(value = "评价种类")
    private String templateKey;

    @ApiModelProperty(value = "其他要求")
    private String remark;



}
