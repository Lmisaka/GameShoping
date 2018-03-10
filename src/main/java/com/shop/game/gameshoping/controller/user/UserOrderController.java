package com.shop.game.gameshoping.controller.user;

import com.github.pagehelper.PageInfo;
import com.shop.game.gameshoping.domain.Order;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.dto.StatusEnum;
import com.shop.game.gameshoping.service.order.OrderService;
import com.shop.game.gameshoping.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UserOrderController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/3/7 10:39
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/3/7     lijq           v1.0.0               修改原因
 */
@RestController
@RequestMapping("user")
public class UserOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "orderList",method = RequestMethod.GET)
    @ApiOperation("获取用户已有订单")
    public ResponseBean getUserOrderList(@RequestBody Long userId,
                                         @RequestParam(defaultValue = "1") Integer page,
                                         @RequestParam(defaultValue = "10") Integer size){
        List<Order> orders = orderService.findOrderByUserId(userId,page,size);
        return new ResponseBean(StatusEnum.SUCCESS,new PageInfo<>(orders));
    }

    @RequestMapping(value = "orderDetail", method = RequestMethod.GET)
    @ApiOperation("通过id获取订单")
    public ResponseBean getUserOrderDetail(@RequestParam Long orderId){
        return new ResponseBean(StatusEnum.SUCCESS,orderService.getByOrderId(orderId));
    }
}
