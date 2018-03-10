package com.shop.game.gameshoping.service.product;

import com.shop.game.gameshoping.domain.Product;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ProductService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/4 13:32
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/4     lijq           v1.0.0               修改原因
 */
public interface ProductService {


    /**
     * 创建商品
     * @param product
     * @return
     */
    int createProduct(Product product);

    /**
     * 通过产品id查询产品
     * @param id
     * @return
     */
    Product searchProductById(long id);

    /**
     * 查询一个用户的所有商品
     * @param userid
     * @return
     */
    List<Product> searchProductByUserId(long userid);


    /**
     * 更新产品
     * @param product
     * @return
     */
    int updateProduct(Product product);

    List<Product> searchProductByType(String type);

    List<Product> searchProductByPrice(int low,int high);

    List<Product> searchProductByName(String name);

    /**
     * 产品状态:
     1:正常
     0:删除
     2:下架
     */
    int updateProductState(Long productId,int state);

    List<Product> search(Integer page, Integer size, String sort, Long userId, Long parentId, Integer lowPrice, Integer highPrice);
}
