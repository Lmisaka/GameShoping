package com.shop.game.gameshoping.controller.product;

import com.github.pagehelper.PageInfo;
import com.shop.game.gameshoping.domain.Product;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.dto.StatusEnum;
import com.shop.game.gameshoping.service.product.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: GoodCURDController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/4 13:28
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/4     lijq           v1.0.0               修改原因
 */
@RestController
@RequestMapping(value = "product")
@Api("商品模块")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ApiOperation("产品添加")
    public ResponseBean addProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }

    @RequestMapping(value = "del",method = RequestMethod.DELETE)
    @ApiOperation("产品删除")
    public ResponseBean delProduct(@RequestParam long productId){
        productService.updateProductState(productId,0);
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }

    @RequestMapping
    @ApiOperation("产品更新")
    public ResponseBean updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    @ApiOperation("获取产品列表")
    public ResponseBean getProductList(@RequestParam(defaultValue = "1") Integer page,
                                       @RequestParam(defaultValue = "20") Integer size,
                                       @RequestParam(required = false) String sort,
                                       @RequestParam(required = false) Long userId,
                                       @RequestParam(required = false) Long parentId,
                                       @RequestParam(required = false) Integer lowPrice,
                                       @RequestParam(required = false) Integer highPrice){
        List<Product> products = productService.search(page,size,sort,userId,parentId,lowPrice,highPrice);
        return new ResponseBean(StatusEnum.SUCCESS,new PageInfo<>(products));
    }

    @RequestMapping(value = "detail", method = RequestMethod.GET)
    @ApiOperation("通过id获取商品详情")
    public ResponseBean getProductDetail(@RequestBody Long productId){
        Product product = productService.searchProductById(productId);
        return new ResponseBean(StatusEnum.SUCCESS,product);
    }


}
