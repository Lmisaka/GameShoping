package com.shop.game.gameshoping.service.user;

import com.shop.game.gameshoping.domain.Resources;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ResourcesService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 15:58
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
public interface ResourcesService {

    /**
     * 加载用户权限
     * @param userid
     * @return
     */
    List<Resources> loadUserResources(long userid);
}
