package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.SysOplog;
import com.etc.data.mapper.SysOplogMapper;
import com.etc.data.service.SysOplogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志 服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class SysOplogServiceImpl extends ServiceImpl<SysOplogMapper, SysOplog> implements SysOplogService {

}
