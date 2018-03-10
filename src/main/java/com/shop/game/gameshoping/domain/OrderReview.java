package com.shop.game.gameshoping.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_review")
public class OrderReview {
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 评论时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private Long critic;

    @Column(name = "aim_id")
    private Long aimId;

    private String message;

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
     * 获取评论时间
     *
     * @return create_time - 评论时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置评论时间
     *
     * @param createTime 评论时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return critic
     */
    public Long getCritic() {
        return critic;
    }

    /**
     * @param critic
     */
    public void setCritic(Long critic) {
        this.critic = critic;
    }

    /**
     * @return aim_id
     */
    public Long getAimId() {
        return aimId;
    }

    /**
     * @param aimId
     */
    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}