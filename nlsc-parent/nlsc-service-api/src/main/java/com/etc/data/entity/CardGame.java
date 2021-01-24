package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 11264 kB
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CardGame implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动主题
     */
    private String title;

    /**
     * 活动简介
     */
    private String info;

    /**
     * 类型（1=概率类，2=随机类）
     */
    private Integer type;

    /**
     * 状态（0=新建，1=已加载）
     */
    private Boolean status;


}
