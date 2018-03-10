package com.shop.game.gameshoping.service.order;

import com.shop.game.gameshoping.domain.Order;
import com.shop.game.gameshoping.dto.OrderInfo;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: OrderService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/13 13:40
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/13     lijq           v1.0.0               修改原因
 */
public interface OrderService {

    int delOrder(long orderId);

    /**
     * 创建订单
     * @param order
     * @return 订单编号
     */
    long addOrder(OrderInfo order);

    List<Order> findOrderByUserId(Long id, Integer page, Integer userId);

    List<Order> searchOrderListByUserId(long userId);

    Order getByOrderId(Long orderId);
}
