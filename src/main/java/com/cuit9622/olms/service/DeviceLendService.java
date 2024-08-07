package com.cuit9622.olms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cuit9622.olms.entity.Device;
import com.cuit9622.olms.entity.DeviceLend;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cuit9622.olms.vo.DeviceVo;

import java.util.List;
import java.util.Map;

/**
* @author wzq
* @description 针对表【sys_device_lend(设备借阅表)】的数据库操作Service
*/
public interface DeviceLendService extends IService<DeviceLend> {

    /**
     * @Description 获取预约实验室
     * @param id  用户id
     * @return
     */
    List<Map<Long, String>> getAppointmentLab(Long id);

    /**
     * @Description 设备信息的分页查找
     * @param page 分页信息
     * @param  name 设备名称
     * @param  labId 实验室id
     * @return
     */
    Page<DeviceVo> getDevice(Integer pageSize, Integer page, String name, Long labId);

    /**
     * @Description 设备信息的分页查找
     * @param page 分页信息
     * @param  name 设备名称
     * @param  userId 用户id
     * @return
     */
    Page<DeviceVo> getLendDevice(Integer pageSize, Integer page, String name, Long userId);

    /**
     * @Description 根据型号归还设备(逐一归还)
     * @param deviceVo 设备信息
     * @return
     */
    Integer returnDeviceByModel(Long id);

    /**
     * @Description 根据设备信息借用设备
     * @param deviceVo 设备信息
     * @param userId 用户id
     * @return
     */
    Integer lendDeviceByModel(DeviceVo deviceVo, Long userId);
}
