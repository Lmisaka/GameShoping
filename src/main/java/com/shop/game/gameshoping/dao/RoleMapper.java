package com.shop.game.gameshoping.dao;

import com.shop.game.gameshoping.domain.Role;
import com.shop.game.gameshoping.util.pageHelper.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    List<Role> loadUserRole(long userId);

    void addRole(long userId);
}