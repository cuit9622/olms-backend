package com.cuit9622.olms.vo;

import com.cuit9622.olms.entity.Teacher;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * Author: lsh
 * Date: 2023/5/11 16:35
 * Version: 1.0
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Slf4j
public class TeacherVo extends Teacher{

    @ApiModelProperty("学院名称")
    private String collegeName;

    @ApiModelProperty("是否设置为管理员")
    private int isSetManager;

    /**
     * 1:重置 0:不重置
     */
    @ApiModelProperty("是否重置密码")
    private int isResetPwd;
}