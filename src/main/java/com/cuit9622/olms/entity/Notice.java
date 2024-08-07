package com.cuit9622.olms.entity;

import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 公告实体类
 */
@Data
@ApiModel("公告")
public class Notice implements Serializable {

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("公告标题")
    private String title;

    @ApiModelProperty("公告内容")
    private String content;

    @ApiModelProperty("公告发表时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createTime;

    @ApiModelProperty("公告修改时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date updateTime;

    @ApiModelProperty("发布人的id")
    private Long creator;

    @NotNull(message="[公告的等级，按照公告从小到大排序]不能为空")
    @ApiModelProperty("公告的等级，按照公告从小到大排序")
    private Integer level;

}
