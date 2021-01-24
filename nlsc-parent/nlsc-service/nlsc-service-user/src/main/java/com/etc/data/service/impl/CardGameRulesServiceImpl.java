package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.CardGameRules;
import com.etc.data.mapper.CardGameRulesMapper;
import com.etc.data.service.CardGameRulesService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 活动策略; InnoDB free: 11264 kB; (`gameid`) REFER `prize/card_game`(`id`) ON UPDATE  服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class CardGameRulesServiceImpl extends ServiceImpl<CardGameRulesMapper, CardGameRules> implements CardGameRulesService {

}
