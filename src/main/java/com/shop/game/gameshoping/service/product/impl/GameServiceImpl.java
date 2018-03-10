package com.shop.game.gameshoping.service.product.impl;

import com.github.pagehelper.PageHelper;
import com.shop.game.gameshoping.dao.GameMapper;
import com.shop.game.gameshoping.domain.Game;
import com.shop.game.gameshoping.service.product.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: GameServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/16 17:23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/16     lijq           v1.0.0               修改原因
 */
@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameMapper gameDao;

    @Override
    public List<Game> selectAll(Game game) {
        if(game.getRows() != null && game.getPage() !=null){
            PageHelper.startPage(game.getPage(),game.getRows());
        }
        return gameDao.selectAll();
    }


    @Override
    public List<Game> search(String key) {
        return null;
    }
}
