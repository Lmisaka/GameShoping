package com.shop.game.gameshoping.service.user.impl;

import com.shop.game.gameshoping.dao.UserBaseMapper;
import com.shop.game.gameshoping.domain.UserBase;
import com.shop.game.gameshoping.exception.DataBaseException;
import com.shop.game.gameshoping.service.user.UserService;
import com.shop.game.gameshoping.util.PassWordEncode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

/**
 * Copyright: Copyright (c) 2018 Asiainfo-Linkage
 *
 * @ClassName: UserServiceImpl
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/1 22:41
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/1     lijq           v1.0.0               修改原因
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserBaseMapper userBaseMapper;

    @Override
    public int register(UserBase User) {
        return userBaseMapper.insertSelective(User);
    }

    @Override
    public boolean login(UserBase User, String password) {
        if (password.equals(userBaseMapper.selectPassWdByPrimaryKey(User.getId()))) {
            return true;
        }
        return false;
    }

    @Override
    public UserBase fingUserByUsername(String username) {
        UserBase userBase = new UserBase();
        userBase.setUserName(username);
        return userBaseMapper.selectOne(userBase);
    }

    @Override
    public UserBase findUserByUserId(long userId) {
        return userBaseMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateUserPassWord(long userId, String newPwd) {
        UserBase userBase = new UserBase();
        userBase.setId(userId);
        userBase.setUserPwd(PassWordEncode.md5(String.valueOf(userId),newPwd));
        if(userBaseMapper.updateByPrimaryKeySelective(userBase) !=1){
            throw new DataBaseException("修改密码失败");
        }
        return 0;
    }

    @Override
    public UserBase getUserByToken(String token) {

        return null;
    }
}
