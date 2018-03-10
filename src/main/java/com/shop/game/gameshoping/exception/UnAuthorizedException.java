package com.shop.game.gameshoping.exception;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: UnAuthorizedException
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 09:22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException() {
        super();
    }

    public UnAuthorizedException(String message) {
        super(message);
    }
}
