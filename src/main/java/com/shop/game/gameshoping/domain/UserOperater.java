package com.shop.game.gameshoping.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_operater")
public class UserOperater {
    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 记录时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录信息
     */
    private String operater;

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取记录时间
     *
     * @return create_time - 记录时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录时间
     *
     * @param createTime 记录时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取记录信息
     *
     * @return operater - 记录信息
     */
    public String getOperater() {
        return operater;
    }

    /**
     * 设置记录信息
     *
     * @param operater 记录信息
     */
    public void setOperater(String operater) {
        this.operater = operater;
    }
}