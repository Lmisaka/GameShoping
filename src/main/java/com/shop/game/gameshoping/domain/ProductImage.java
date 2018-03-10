package com.shop.game.gameshoping.domain;

import javax.persistence.*;

@Table(name = "product_image")
public class ProductImage {
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "src_image")
    private String srcImage;

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return src_image
     */
    public String getSrcImage() {
        return srcImage;
    }

    /**
     * @param srcImage
     */
    public void setSrcImage(String srcImage) {
        this.srcImage = srcImage;
    }
}