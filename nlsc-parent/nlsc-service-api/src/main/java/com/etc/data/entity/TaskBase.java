package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 定时任务; InnoDB free: 11264 kB
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TaskBase implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 任务类型
     */
    private Integer targetType;

    /**
     * 任务值
     */
    private String targetValue;

    /**
     * cron表达式
     */
    private String cron;

    /**
     * 上次执行结果
     */
    private String lastRunResult;

    /**
     * 上次执行时间
     */
    private LocalDateTime lastRunTime;

    /**
     * 上次执行耗时
     */
    private Integer lastRunTimeCost;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
