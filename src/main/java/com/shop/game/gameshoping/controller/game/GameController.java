package com.shop.game.gameshoping.controller.game;

import com.github.pagehelper.PageInfo;
import com.shop.game.gameshoping.domain.Game;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.dto.StatusEnum;
import com.shop.game.gameshoping.service.product.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: GameController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/16 17:18
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/16     lijq           v1.0.0               修改原因
 */
@RestController
@RequestMapping(value = "game")
@Api(value = "游戏信息模块")
public class GameController {
    @Autowired
    private GameService gameService;

    @ApiOperation("获取游戏列表")
    @RequestMapping(value = "list/{page}/{row}",method = RequestMethod.GET)
    public ResponseBean getGameList(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "10") int row){
        Game game = new Game();
        game.setPage(page);
        game.setRows(row);
        return new ResponseBean(StatusEnum.SUCCESS,new PageInfo<>(gameService.selectAll(game)));
    }

    @ApiOperation("获取游戏列表")
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseBean getGameList(@RequestParam Integer gameType){
        Game game = new Game();
        game.setRows(null);
        game.setPage(null);
        game.setGameType(gameType);
        return new ResponseBean(StatusEnum.SUCCESS,gameService.selectAll(game));
    }
}
