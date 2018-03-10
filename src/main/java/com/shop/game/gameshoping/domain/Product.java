package com.shop.game.gameshoping.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Product {
    /**
     * 主键
     */
    @Id
    @Column(name = "product_id")
    private Long productId;

    /**
     * 所属分类
     */
    @Column(name = "product_category")
    private String productCategory;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品类型
     */
    @Column(name = "product_subtype")
    private Integer productSubtype;

    /**
     * 父类型
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 所属用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 产品价格
     */
    @Column(name = "product_price")
    private Integer productPrice;

    /**
     * 产品状态:
1:正常
0:删除
2:下架
     */
    private Integer state;

    /**
     * 创建时间

     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最近修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 产品描述
     */
    @Column(name = "product_description")
    private String productDescription;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", productSubtype=" + productSubtype +
                ", parentId=" + parentId +
                ", userId=" + userId +
                ", productPrice=" + productPrice +
                ", state=" + state +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }

    /**
     * 获取主键
     *
     * @return product_id - 主键
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置主键
     *
     * @param productId 主键
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取所属分类
     *
     * @return product_category - 所属分类
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * 设置所属分类
     *
     * @param productCategory 所属分类
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品类型
     *
     * @return product_subtype - 商品类型
     */
    public Integer getProductSubtype() {
        return productSubtype;
    }

    /**
     * 设置商品类型
     *
     * @param productSubtype 商品类型
     */
    public void setProductSubtype(Integer productSubtype) {
        this.productSubtype = productSubtype;
    }

    /**
     * 获取父类型
     *
     * @return parent_id - 父类型
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父类型
     *
     * @param parentId 父类型
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取所属用户编号
     *
     * @return user_id - 所属用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置所属用户编号
     *
     * @param userId 所属用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取产品价格
     *
     * @return product_price - 产品价格
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * 设置产品价格
     *
     * @param productPrice 产品价格
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取产品状态:
1:正常
0:删除
2:下架
     *
     * @return state - 产品状态:
1:正常
0:删除
2:下架
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置产品状态:
1:正常
0:删除
2:下架
     *
     * @param state 产品状态:
1:正常
0:删除
2:下架
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取最近修改时间
     *
     * @return update_time - 最近修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最近修改时间
     *
     * @param updateTime 最近修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取产品描述
     *
     * @return product_description - 产品描述
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * 设置产品描述
     *
     * @param productDescription 产品描述
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}