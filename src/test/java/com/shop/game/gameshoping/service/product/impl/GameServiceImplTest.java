package com.shop.game.gameshoping.service.product.impl;

import com.shop.game.gameshoping.dao.GameMapper;
import com.shop.game.gameshoping.domain.Game;
import com.shop.game.gameshoping.service.product.GameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: GameServiceImplTest
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/17 15:21
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/17     lijq           v1.0.0               修改原因
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GameServiceImplTest {
    @Autowired
    private GameService gameService;

    @Autowired
    private GameMapper gameMapper;
    @Test
    public void selectAll() {
        Game game = new Game();
        List<Game> gameList= gameService.selectAll(game);
        for (Game game1 : gameList) {
            System.out.println(game1);
        }
    }

    @Test
    public void selectAll1() {
        System.out.println(gameMapper.selectByPrimaryKey((Integer) 1));
    }

    @Test
    public void search() {
    }
}