package com.shop.game.gameshoping.exception;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: DataBaseException
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/23 10:41
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/23     lijq           v1.0.0               修改原因
 */
public class DataBaseException extends RuntimeException {
    public DataBaseException() {
        super();
    }

    public DataBaseException(String message) {
        super(message);
    }
}
