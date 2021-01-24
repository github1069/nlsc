package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 菜单按钮; InnoDB free: 11264 kB
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysMenuBtn implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属菜单
     */
    private Integer menuId;

    /**
     * 按钮名称
     */
    private String btnName;

    /**
     * 页面class名称
     */
    private String className;

    /**
     * 后台method名称
     */
    private String methodName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
