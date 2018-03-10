package com.shop.game.gameshoping.dto;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: StatusEnum
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 23:18
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
public enum StatusEnum {
    SUCCESS(200,"SUCCESS"),
    EXIST_USER(409,"已有该用户"),
    REGISTER_ERROR(400,"注册失败")
    ;
    private int code;
    private String description;

    StatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
