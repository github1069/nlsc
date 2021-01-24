package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 活动策略; InnoDB free: 11264 kB; (`gameid`) REFER `prize/card_game`(`id`) ON UPDATE 
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CardGameRules implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动id
     */
    private Integer gameid;

    /**
     * 会员等级
     */
    private Integer userlevel;

    /**
     * 可抽奖次数（0为不限）
     */
    private Integer enterTimes;

    /**
     * 最大中奖次数（0为不限）
     */
    private Integer goalTimes;


}
