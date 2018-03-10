package com.shop.game.gameshoping.service.user.impl;

import com.shop.game.gameshoping.domain.UserBase;
import com.shop.game.gameshoping.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright: Copyright (c) 2018 Asiainfo-Linkage
 *
 * @ClassName: UserServiceImplTest
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/1 22:53
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/1     lijq           v1.0.0               修改原因
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void register() {
        UserBase userBase = new UserBase();
        userBase.setNickname("123");
        userBase.setUserPwd("123");
        userService.register(userBase);
//        userBaseDao.insertSelective(userBase);
    }

    @Test
    public void login() {
    }

    @Test
    public void register1() {
    }

    @Test
    public void login1() {
    }

    @Test
    public void fingUserByUsername() {

        System.out.println("sdfdfdgs: "+userService.fingUserByUsername("misaka"));
        int i;

    }
}