package com.etc.data.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.etc.data.entity.CardUser;
import com.etc.data.mapper.CardUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 会员信息表; InnoDB free: 11264 kB 服务类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public interface CardUserService extends IService<CardUser> {

    /**
     * 查询用户列表信息
     * @param
     * @return
     */
    public List<CardUser> findCardUserList();

}
