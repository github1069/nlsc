package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.TaskLog;
import com.etc.data.mapper.TaskLogMapper;
import com.etc.data.service.TaskLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务-日志; InnoDB free: 11264 kB 服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class TaskLogServiceImpl extends ServiceImpl<TaskLogMapper, TaskLog> implements TaskLogService {

}
