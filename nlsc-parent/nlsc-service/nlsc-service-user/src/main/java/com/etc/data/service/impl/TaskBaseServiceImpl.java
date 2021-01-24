package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.TaskBase;
import com.etc.data.mapper.TaskBaseMapper;
import com.etc.data.service.TaskBaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务; InnoDB free: 11264 kB 服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class TaskBaseServiceImpl extends ServiceImpl<TaskBaseMapper, TaskBase> implements TaskBaseService {

}
