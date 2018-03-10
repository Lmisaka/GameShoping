package com.shop.game.gameshoping.service.user;

import com.shop.game.gameshoping.domain.Role;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: RoleService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 09:16
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
public interface RoleService {

    /**
     * 获取用户角色
     * @param userId
     * @return
     */
    List<Role> loadUserRole(long userId);

    void addUserRole(long userId);

}
