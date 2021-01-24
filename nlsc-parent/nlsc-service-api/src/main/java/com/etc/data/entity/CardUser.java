package com.etc.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员信息表; InnoDB free: 11264 kB
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CardUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 姓名
     */
    private String realname;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 注册时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;


}
