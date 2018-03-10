package com.shop.game.gameshoping.dao;

import com.shop.game.gameshoping.domain.UserBase;
import com.shop.game.gameshoping.util.pageHelper.MyMapper;

public interface UserBaseMapper extends MyMapper<UserBase> {
    String selectPassWdByPrimaryKey(Long id);

    UserBase selectUserByUsername(String username);
}