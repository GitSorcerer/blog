package com.gaoh.modules.oss.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gaoh.entity.manage.oss.OssResource;
import com.gaoh.modules.oss.mapper.OssResourceMapper;
import com.gaoh.modules.oss.service.OssResourceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 云存储资源表 服务实现类
 * </p>
 *
 * @author gaoh
 * @since 2018-11-30
 */
@Service
public class OssResourceServiceImpl extends ServiceImpl<OssResourceMapper, OssResource> implements OssResourceService {

}
