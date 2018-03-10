package com.shop.game.gameshoping.service.user;

import com.shop.game.gameshoping.domain.UserBase;

/**
 * Copyright: Copyright (c) 2018 Asiainfo-Linkage
 *
 * @ClassName: UserService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/1 22:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/1     lijq           v1.0.0               修改原因
 */
public interface UserService {
    int register(UserBase userBase);
    boolean login(UserBase userBase, String password);

    UserBase fingUserByUsername(String username);

    UserBase findUserByUserId(long userId);

    int updateUserPassWord(long userId, String newPwd);

    UserBase getUserByToken(String token);
}
