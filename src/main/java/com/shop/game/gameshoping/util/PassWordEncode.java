package com.shop.game.gameshoping.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: PassWordEncode
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/2 22:59
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/2     lijq           v1.0.0               修改原因
 */
public class PassWordEncode {

    public static String md5(String username,String password){
        return (new SimpleHash("MD5",password, ByteSource.Util.bytes(username),2).toHex());
    }

    public static void main(String[] args) {
        System.out.println(md5("misaka","123"));
    }
}
