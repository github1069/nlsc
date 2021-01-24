package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 表单扩展js
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZcurdHeadJs implements Serializable {

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
     * 页面
     */
    private String page;

    /**
     * 扩展sql
     */
    private String sqlContent;

    /**
     * 扩展js
     */
    private String jsContent;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
