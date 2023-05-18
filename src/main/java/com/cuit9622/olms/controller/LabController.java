package com.cuit9622.olms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cuit9622.common.exception.BizException;
import com.cuit9622.common.model.R;
import com.cuit9622.olms.model.DeleteModel;
import com.cuit9622.olms.model.LabSelectModel;
import com.cuit9622.olms.service.LabService;
import com.cuit9622.olms.vo.LabVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: lsh
 * Date: 2023/5/15 15:42
 * Version: 1.0
 * @Description: 实验室控制器
 */
@RestController
@Slf4j(topic = "LabController")
@Api("实验室相关接口")
public class LabController {

    @Resource
    private LabService labService;

    /**
     * @Description 分页查询实验室的接口
     * @param model
     * @return
     * @Date 16:09 2023/5/15
     */
    @GetMapping("/lab")
    @ApiOperation("实验室查询分页查询的接口")
    public R<Page<LabVo>> getLab(LabSelectModel model){
        Page<LabVo> page = new Page<>(model.getPage(), model.getPageSize());
        labService.listByPage(page,model);
        log.info("分页查询的实验室信息为{}",page);
        return R.ok("查询实验室信息成功", page);
    }

    /**
     * @Description 根据id删除实验室信息
     * @param id
     * @return
     * @Date 21:44 2023/5/18
     */
    @DeleteMapping("/auth/lab/{id}")
    @RequiresRoles("admin")
    @ApiOperation("根据id删除实验室")
    public R<String> deleteLab(@PathVariable("id") Integer id){
        boolean isTrue = labService.removeById(id);
        if (!isTrue){
            throw new BizException("删除失败");
        }
        return R.ok("删除成功");
    }

    /**
     * @Description 批量删除实验室
     * @param model
     * @return
     * @Date 21:47 2023/5/18
     */
    @DeleteMapping("/auth/lab")
    @RequiresRoles("admin")
    @ApiOperation("批量删除实验室")
    public R<String> deleteLabs(@RequestBody DeleteModel model){
        boolean isTrue = labService.removeBatchByIds(model.getIds());
        if (!isTrue){
            throw new BizException("批量删除失败");
        }
        return R.ok("批量删除成功");
    }
}