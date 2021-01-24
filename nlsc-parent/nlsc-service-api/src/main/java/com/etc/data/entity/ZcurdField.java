package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 在线表单字段
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZcurdField implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属表
     */
    private Integer headId;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 列表列名
     */
    private String columnName;

    /**
     * 列宽
     */
    private Integer columnLength;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 控件类型
     */
    private String inputType;

    /**
     * 是否列表显示
     */
    private Integer isShowList;

    /**
     * 是否详情显示
     */
    private Integer isAllowDetail;

    /**
     * 是否允许增加
     */
    private Integer isAllowAdd;

    /**
     * 是否允许编辑
     */
    private Integer isAllowUpdate;

    /**
     * 是否搜索
     */
    private Integer isSearch;

    /**
     * 是否允许为空
     */
    private Integer isAllowNull;

    /**
     * 字典sql
     */
    private String dictSql;

    /**
     * 顺序
     */
    private Integer orderNum;

    /**
     * 搜索类型(1:值,2:范围)
     */
    private Integer searchType;

    /**
     * 是否汇总
     */
    private Integer isSum;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
