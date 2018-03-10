package com.shop.game.gameshoping.dto;

/**
 * Copyright: Copyright (c) 2018
 *
 * @ClassName: ResponseBean
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lijq
 * @date: 2018/2/3 09:19
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2018/2/3     lijq           v1.0.0               修改原因
 */
public class ResponseBean {
    /**
     * 状态码
     */
    private int code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public ResponseBean(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseBean(int code, String message, Object data) {

        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseBean(StatusEnum status, Object data){
        this.code = status.getCode();
        this.message = status.getDescription();
        this.data = data;
    }
}
