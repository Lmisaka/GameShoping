package com.shop.game.gameshoping.service.product;

import com.shop.game.gameshoping.domain.Game;

import java.util.List;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: GameService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/4 14:26
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/4     lijq           v1.0.0               修改原因
 */
public interface GameService {
    List<Game> selectAll(Game game);

    List<Game> search(String key);

}
