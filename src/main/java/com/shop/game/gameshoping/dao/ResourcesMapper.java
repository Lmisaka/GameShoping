package com.shop.game.gameshoping.dao;

import com.shop.game.gameshoping.domain.Resources;
import com.shop.game.gameshoping.util.pageHelper.MyMapper;

import java.util.List;

public interface ResourcesMapper extends MyMapper<Resources> {
    List<Resources> loadUserResources(long userId);
}