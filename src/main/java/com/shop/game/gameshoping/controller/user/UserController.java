package com.shop.game.gameshoping.controller.user;

import com.shop.game.gameshoping.domain.UserBase;
import com.shop.game.gameshoping.dto.ResponseBean;
import com.shop.game.gameshoping.dto.StatusEnum;
import com.shop.game.gameshoping.service.user.RoleService;
import com.shop.game.gameshoping.service.user.UserService;
import com.shop.game.gameshoping.util.JWTUtil;
import com.shop.game.gameshoping.util.PassWordEncode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UserController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/8 21:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/8     lijq           v1.0.0               修改原因
 */
@Api(value = "用户操作模块")
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseBean userAdd(@RequestBody UserBase user) {
        if(null != userService.fingUserByUsername(user.getUserName())){
            return new ResponseBean(StatusEnum.EXIST_USER,null);
        }
        user.setUserPwd(PassWordEncode.md5(user.getUserName(), user.getUserPwd()));
        userService.register(user);
        return new ResponseBean(StatusEnum.SUCCESS, JWTUtil.sign(user.getUserName(),user.getUserPwd()));
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public ResponseBean login(@RequestBody UserBase user) {
        UserBase userBean = userService.fingUserByUsername(user.getUserName());
        if (PassWordEncode.md5(user.getUserName(),user.getUserPwd()).equals(userBean.getUserPwd())) {
            HashMap<String,String> result = new HashMap<>();
            result.put("token",JWTUtil.sign(user.getUserName(), user.getUserPwd()));
            result.put("id",String.valueOf(userBean.getId()));
            return new ResponseBean(200, "Login success", result);
        } else {
            throw new UnauthorizedException();
        }
    }

    @ApiOperation(value = "查看用户是否登录")
    @RequestMapping(value = "checkLogin",method = RequestMethod.GET)
    public ResponseBean userCheckLogin(@RequestParam(defaultValue = "") String token){
        UserBase userBase = userService.getUserByToken(token);
        return null;
    }

    @ApiOperation(value = "查看用户信息")
    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public ResponseBean userInof(@RequestBody long userId){
        return new ResponseBean(StatusEnum.SUCCESS,userService.findUserByUserId(userId));
    }

    @ApiOperation(value = "查询用户角色")
    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public ResponseBean userRole(@RequestBody long userId){
        return new ResponseBean(StatusEnum.SUCCESS,roleService.loadUserRole(userId));
    }

    @ApiOperation(value = "添加用户商家角色")
    @RequestMapping(value = "/addShoper",method = RequestMethod.PUT)
    public ResponseBean addUserRole(@RequestBody long userId){
        roleService.addUserRole(userId);
        return new ResponseBean(StatusEnum.SUCCESS,"添加成功");
    }

    @RequestMapping(value = "logout",method = RequestMethod.GET)
    @ApiOperation(value = "退出登录")
    public ResponseBean logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }

    @RequestMapping(value = "roleName",method = RequestMethod.GET)
    @ApiOperation(value = "判断角色是否已存在")
    public boolean roleName(String name){
        if(userService.fingUserByUsername(name)!=null){
            return false;
        }
        return true;
    }

    @RequestMapping(value = "changePass",method = RequestMethod.POST)
    @ApiOperation(value = "修改密码")
    public ResponseBean changePassWd(@RequestParam long userId,@RequestParam String newPwd){
        userService.updateUserPassWord(userId,newPwd);
        return new ResponseBean(StatusEnum.SUCCESS,null);
    }


}
