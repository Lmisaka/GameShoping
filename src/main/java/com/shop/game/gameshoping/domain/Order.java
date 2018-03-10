package com.shop.game.gameshoping.domain;

import java.util.Date;
import javax.persistence.*;

public class Order {
    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "buyer_id")
    private Long buyerId;

    @Column(name = "bussiness_id")
    private Long bussinessId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付方式
     */
    @Column(name = "pay_way")
    private Integer payWay;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "end_time")
    private Date endTime;

    /**
     * @return order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return buyer_id
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return bussiness_id
     */
    public Long getBussinessId() {
        return bussinessId;
    }

    /**
     * @param bussinessId
     */
    public void setBussinessId(Long bussinessId) {
        this.bussinessId = bussinessId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付方式
     *
     * @return pay_way - 支付方式
     */
    public Integer getPayWay() {
        return payWay;
    }

    /**
     * 设置支付方式
     *
     * @param payWay 支付方式
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}