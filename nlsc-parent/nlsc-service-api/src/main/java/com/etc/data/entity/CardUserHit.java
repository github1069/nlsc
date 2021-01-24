package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class CardUserHit implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动
     */
    private Integer gameid;

    /**
     * 用户
     */
    private Integer userid;

    /**
     * 奖品
     */
    private Integer productid;

    /**
     * 中奖时间
     */
    private LocalDateTime hittime;


}
