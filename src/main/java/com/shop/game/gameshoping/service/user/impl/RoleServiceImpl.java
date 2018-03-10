package com.shop.game.gameshoping.service.user.impl;

import com.shop.game.gameshoping.dao.RoleMapper;
import com.shop.game.gameshoping.domain.Role;
import com.shop.game.gameshoping.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: RoleServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/9 00:53
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/9     lijq           v1.0.0               修改原因
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> loadUserRole(long userId) {
        return roleMapper.loadUserRole(userId);
    }

    @Override
    public void addUserRole(long userId) {
        roleMapper.addRole(userId);
    }
}
