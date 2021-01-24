package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.CardUser;
import com.etc.data.mapper.CardUserMapper;
import com.etc.data.service.CardUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员信息表; InnoDB free: 11264 kB 服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class CardUserServiceImpl extends ServiceImpl<CardUserMapper, CardUser> implements CardUserService {

    @Autowired
    private CardUserMapper cardUserMapper;

    @Override
    public List<CardUser> findCardUserList() {

        return null;
    }
}
