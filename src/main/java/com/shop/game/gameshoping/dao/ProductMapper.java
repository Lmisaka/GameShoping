package com.shop.game.gameshoping.dao;

import com.shop.game.gameshoping.domain.Product;
import com.shop.game.gameshoping.util.pageHelper.MyMapper;

import java.util.List;

public interface ProductMapper extends MyMapper<Product> {
    List<Product> FindProductByUserId(long userid);

    List<Product> searchProductByType(String type);

    int changeProductState(Long id,int state);
}