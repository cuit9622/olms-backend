package com.cuit9622.olms.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cuit9622.olms.entity.Notice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuit9622.olms.model.NoticeSelectModel;
import com.cuit9622.olms.vo.NoticeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 刘世浩
* @description 针对表【sys_notice(公告表)】的数据库操作Mapper
* @Entity com.cuit9622.olms.entity.Notice
*/
@Mapper
public interface NoticeMapper extends BaseMapper<Notice> {

    /**
     * @Description 公告信息的分页查找
     * @param page 分页信息
     * @param model 查询的条件
     * @return
     */
    Page<NoticeVo> page(@Param("page") Page<NoticeVo> page, @Param("model") NoticeSelectModel model);
}




