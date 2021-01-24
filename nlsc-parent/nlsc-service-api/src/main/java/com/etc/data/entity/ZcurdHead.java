package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 在线表单
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZcurdHead implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据库表名
     */
    private String tableName;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 主键字段
     */
    private String idField;

    /**
     * 是否自增
     */
    private Integer isAuto;

    /**
     * 表单类型（1:单表,2:主从）
     */
    private Integer formType;

    /**
     * 弹窗大小
     */
    private String dialogSize;

    /**
     * 数据源
     */
    private String dbSource;

    /**
     * 处理类
     */
    private String handleClass;

    /**
     * 删除标志字段
     */
    private String deleteFlagField;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
