package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 11264 kB; (`gameid`) REFER `prize/card_game`(`id`) ON UPDATE CASCAD
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CardGameProduct implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动
     */
    private Integer gameid;

    /**
     * 奖品
     */
    private Integer productid;

    /**
     * 数量
     */
    private Integer amount;


}
