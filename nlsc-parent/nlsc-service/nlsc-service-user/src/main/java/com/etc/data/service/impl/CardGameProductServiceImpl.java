package com.etc.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.etc.data.entity.CardGameProduct;
import com.etc.data.mapper.CardGameProductMapper;
import com.etc.data.service.CardGameProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 11264 kB; (`gameid`) REFER `prize/card_game`(`id`) ON UPDATE CASCAD 服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-01-22
 */
@Service
public class CardGameProductServiceImpl extends ServiceImpl<CardGameProductMapper, CardGameProduct> implements CardGameProductService {

}
