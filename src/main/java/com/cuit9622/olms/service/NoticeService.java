package com.cuit9622.olms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cuit9622.common.model.R;
import com.cuit9622.olms.entity.Notice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description 公告接口
 * @Date 17:02 2023/4/28
 */
public interface NoticeService extends IService<Notice> {

    /**
     * @Description 分页查询公告
     * @param pageSize 条数
     * @param page 第几页
     * @return
     * @Date 17:21 2023/4/28
     */
    R<Page<Notice>> selectNotice(Integer pageSize, Integer page);
}