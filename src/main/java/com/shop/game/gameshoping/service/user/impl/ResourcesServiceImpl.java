package com.shop.game.gameshoping.service.user.impl;

import com.shop.game.gameshoping.dao.ResourcesMapper;
import com.shop.game.gameshoping.domain.Resources;
import com.shop.game.gameshoping.service.user.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ResourcesServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 16:18
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {


    @Autowired
    private ResourcesMapper resourcesMapper;

    @Override
    public List<Resources> loadUserResources(long userId) {
        return resourcesMapper.loadUserResources(userId);
    }
}
