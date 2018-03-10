package com.shop.game.gameshoping.service.user.impl;

import com.shop.game.gameshoping.dao.UserRoleMapper;
import com.shop.game.gameshoping.domain.UserRole;
import com.shop.game.gameshoping.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UserRoleServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/13 13:04
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/13     lijq           v1.0.0               修改原因
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int addUserRole(long userId) {
        UserRole userRoleKey = new UserRole();
        userRoleKey.setUserId(userId);
        //添加商家角色
        userRoleKey.setRoleId(4);
        return userRoleMapper.insert(userRoleKey);
    }

    @Override
    public int delUserRole(long userId) {
        return 1;
    }
}
