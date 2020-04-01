/*
 * 项目名称:platform-plus
 * 类名称:ActReModelDao.java
 * 包名称:com.platform.modules.act.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-03-18 13:33:07             初版做成
 *
 * Copyright (c) 2019-2019 软件
 */
package com.platform.modules.act.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.modules.act.entity.ActReModelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Dao
 *
 * @author
 * @date 2019-03-18 13:33:07
 */
@Mapper
public interface ActReModelDao extends BaseMapper<ActReModelEntity> {

}
