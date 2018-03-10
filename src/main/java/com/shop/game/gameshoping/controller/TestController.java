package com.shop.game.gameshoping.controller;

import com.shop.game.gameshoping.domain.UserBase;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.service.user.UserService;
import com.shop.game.gameshoping.util.JWTUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: TestController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/4 00:24
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/4     lijq           v1.0.0               修改原因
 */
@RestController
public class TestController {

    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized() {
        return new ResponseBean(401, "Unauthorized", "自定义");
    }


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public ResponseBean login(@RequestBody UserBase user) {
        UserBase userBean = userService.fingUserByUsername(user.getUserName());
        if (userBean.getUserPwd().equals(user.getUserPwd())) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(user.getUserName(), user.getUserPwd()));
        } else {
            throw new UnauthorizedException();
        }
    }
    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ResponseBean register() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return new ResponseBean(200, "You are already logged in", subject.getSession());
        } else {
            return new ResponseBean(200, "You are guest", null);
        }
    }
}
