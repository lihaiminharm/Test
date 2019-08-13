package com.xfsk.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 异常处理类
 *
 * @version: 1.0
 * @Author: cyy
 * @Create Date: 2019-04-18
 */
@ResponseStatus(value= HttpStatus.FORBIDDEN)
public class InvokeException extends RuntimeException {
    public InvokeException(){
        super("调用异常，参数不能为空！");
    }

}
