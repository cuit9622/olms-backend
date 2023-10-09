package com.cuit9622.olms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预约信息表
 * @TableName sys_appointment
 */
@TableName(value ="sys_appointment")
@Data
public class Appointment implements Serializable {
    /**
     * 预约信息表的id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 预约的用户
     */
    private Integer userId;

    /**
     * 预约的实验室
     */
    private Integer labId;

    /**
     * 实验名称
     */
    private String experimentName;

    /**
     * 目的
     */
    private String purpose;

    /**
     * 实验预约的时间
     */
    private Date bookTime;

    /**
     * 时间段的id
     */
    private Integer timeSlotId;

    /**
     * 实验性质，1-班级，0-个人
     */
    private Object type;

    /**
     * 专业id
     */
    private Integer majorId;

    /**
     * 预约班级
     */
    private Integer classNumber;

    /**
     * 预约时间段
     */
    private String time;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 状态 0:待审核，1:审核通过，2:审核不通过
     */
    private Object status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}