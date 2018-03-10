package com.shop.game.gameshoping.service.product.impl;

import com.shop.game.gameshoping.dao.ProductMapper;
import com.shop.game.gameshoping.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ProductServiceImplTest
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/3/5 21:52
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/3/5     lijq           v1.0.0               修改原因
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductMapper productMapper;
    @Test
    public void searchProductByType() {
    }

    @Test
    public void searchProductByPrice() {
    }

    @Test
    public void searchProductByName() {
    }

    @Test
    public void updateProductState() {
    }

    @Test
    public void search() {
        Product product = new Product();
        List<Product> products;
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("parentId",2);
        products = productMapper.selectByExample(example);

        products.stream().forEach(e ->{
            System.out.println(e);
        });
    }
}