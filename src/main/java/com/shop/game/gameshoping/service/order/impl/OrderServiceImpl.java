package com.shop.game.gameshoping.service.order.impl;

import com.github.pagehelper.PageHelper;
import com.shop.game.gameshoping.dao.OrderMapper;
import com.shop.game.gameshoping.domain.Order;
import com.shop.game.gameshoping.dto.OrderInfo;
import com.shop.game.gameshoping.exception.DataBaseException;
import com.shop.game.gameshoping.service.order.OrderService;
import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Paper;
import java.util.Date;
import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: OrderServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/13 13:42
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/13     lijq           v1.0.0               修改原因
 */
@Service
public class OrderServiceImpl implements OrderService{
    private static final org.apache.log4j.Logger logger = LogManager.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int delOrder(long orderId) {
        if(orderMapper.deleteByPrimaryKey(orderId) != 1){
            throw new DataBaseException("删除订单失败");
        }
        return 0;
    }

    @Override
    public long addOrder(OrderInfo orderInfo) {
        Order order = new Order();
        order.setBuyerId(orderInfo.getUserId());
        order.setPayWay(0);
        order.setOrderStatus(0);
        int count = orderMapper.insertSelective(order);
        if(count >= 1){
            long orderId = orderMapper.getOrderIdByUserId(orderInfo.getUserId());
            return orderId;
        }else {
            throw new DataBaseException("创建订单失败");
        }
    }

    @Override
    public List<Order> findOrderByUserId(Long userId, Integer page, Integer size) {
        Order order = new Order();
        order.setBuyerId(userId);
        if(page != null && size != null){
            PageHelper.startPage(page,size);
        }
        return orderMapper.select(order);
    }

    @Override
    public List<Order> searchOrderListByUserId(long userId) {
        return orderMapper.findOrderByUserId(userId);
    }

    @Override
    public Order getByOrderId(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }


    /**
     * 判断订单是否超时未支付
     */
    public String judgeOrder(Order order){

        String result=null;
        if(order.getOrderStatus() ==0){
            //判断是否已超1天
            long diff=System.currentTimeMillis()-order.getCreateTime().getTime();
            long days = diff / (1000 * 60 * 60 * 24);
            if(days>=1){
                //设置失效
                order.setOrderStatus(5);
                order.setEndTime(new Date());
                if(orderMapper.updateByPrimaryKeySelective(order)!=1){
                    throw new DataBaseException("设置订单关闭失败");
                }
            }else {
                //返回到期时间
                long time=order.getCreateTime().getTime()+1000 * 60 * 60 * 24;
                result= String.valueOf(time);
            }
        }
        return result;
    }
}
