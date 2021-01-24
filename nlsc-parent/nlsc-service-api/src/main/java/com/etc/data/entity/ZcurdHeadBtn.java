package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 表单按钮
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZcurdHeadBtn implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属表单
     */
    private Integer headId;

    /**
     * 按钮名称
     */
    private String btnName;

    /**
     * 按钮图标
     */
    private String btnIcon;

    /**
     * 按钮位置（1：顶部，2：行内）
     */
    private Integer location;

    /**
     * 行为（0：无，1：打开子页面）
     */
    private Integer action;

    /**
     * 方法内容
     */
    private String funcContent;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
