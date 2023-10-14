package com.cuit9622.olms.vo;

import com.cuit9622.olms.entity.Attendance;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.sql.Time;

@EqualsAndHashCode(callSuper = true)
@Data
public class AttendanceForPersonVo extends Attendance {
    private String experimentName;
    private String labName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date bookTime;
    private Time startTime;
    private Time endTime;
}
