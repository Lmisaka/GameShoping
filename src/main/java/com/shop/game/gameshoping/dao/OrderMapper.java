package com.shop.game.gameshoping.dao;

import com.shop.game.gameshoping.domain.Order;
import com.shop.game.gameshoping.util.pageHelper.MyMapper;

import java.util.List;

public interface OrderMapper extends MyMapper<Order> {
    List<Order> findOrderByUserId(long userId);

    long getOrderIdByUserId(long userId);
}