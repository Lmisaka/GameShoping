package com.shop.game.gameshoping.controller.order;

import com.shop.game.gameshoping.dto.OrderInfo;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.dto.StatusEnum;
import com.shop.game.gameshoping.service.order.OrderService;
import com.shop.game.gameshoping.service.product.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: OrderController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/22 22:06
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/22     lijq           v1.0.0               修改原因
 */
@RestController
@RequestMapping("order")
@Api(value = "订单api")
public class OrderController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "create" ,method = RequestMethod.POST)
    @ApiOperation("创建订单")
    public ResponseBean createOrder(@RequestBody OrderInfo orderInfo){
        Map<String,Long> result = new HashMap<>();
        result.put("orderId",orderService.addOrder(orderInfo));
        return new ResponseBean(StatusEnum.SUCCESS,result);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    @ApiOperation("删除订单")
    public ResponseBean deleteOrder(@RequestParam long orderId){
        orderService.delOrder(orderId);
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }



}
