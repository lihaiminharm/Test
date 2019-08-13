package com.xfsk.util;

import java.io.Serializable;

/**
 * 返回信息提示类
 *
 * @version: 1.0
 * @Author: cyy
 * @Create Date: 2019-06-05
 */
public class ResultMessageDto<T> implements Serializable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
