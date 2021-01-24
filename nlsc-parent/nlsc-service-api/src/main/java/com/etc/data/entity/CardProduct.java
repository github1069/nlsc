package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class CardProduct implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 奖品名称
     */
    private String name;

    /**
     * 图片
     */
    private String pic;

    /**
     * 简介
     */
    private String info;

    /**
     * 市场价
     */
    private BigDecimal price;


}
