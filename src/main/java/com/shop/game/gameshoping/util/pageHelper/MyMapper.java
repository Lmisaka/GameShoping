package com.shop.game.gameshoping.util.pageHelper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: MyMapper
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/9 16:11
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/9     lijq           v1.0.0               修改原因
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}