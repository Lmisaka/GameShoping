package com.shop.game.gameshoping.service.product.impl;

import com.github.pagehelper.PageHelper;
import com.shop.game.gameshoping.dao.ProductMapper;
import com.shop.game.gameshoping.domain.Product;
import com.shop.game.gameshoping.exception.DataBaseException;
import com.shop.game.gameshoping.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ProductServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/9 10:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/9     lijq           v1.0.0               修改原因
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public int createProduct(Product product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public Product searchProductById(long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> searchProductByUserId(long userid) {
        return productMapper.FindProductByUserId(userid);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public List<Product> searchProductByType(String type) {
        return productMapper.searchProductByType(type);
    }

    @Override
    public List<Product> searchProductByPrice(int low, int high) {
        return null;
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return null;
    }

    @Override
    public int updateProductState(Long productId,int state) {
        Product product = new Product();
        product.setProductId(productId);
        product.setState(state);
        product.setUpdateTime(new Date());
        if(productMapper.updateByPrimaryKeySelective(product)!=1){
            throw new DataBaseException("修改产品状态失败");
        }
        return 0;
    }

    @Override
    public List<Product> search(Integer page, Integer size, String sort, Long userId, Long parentId, Integer lowPrice, Integer highPrice) {
        if(page != null && size != null){
            PageHelper.startPage(page,size);
        }
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();

        if(userId != null){
            criteria.andEqualTo("userId",userId);
        }

        if(lowPrice != null && highPrice != null){
            criteria.andBetween("productPrice",lowPrice,highPrice);
        }

        if(parentId != null){
            criteria.andEqualTo("parentId",parentId);
        }

        return productMapper.selectByExample(example);
    }
}
