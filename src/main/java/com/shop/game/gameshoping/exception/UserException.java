package com.shop.game.gameshoping.exception;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UserException
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/8 22:30
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/8     lijq           v1.0.0               修改原因
 */
public class UserException extends RuntimeException {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}
