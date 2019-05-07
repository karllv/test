// Copyright 2016-2101 Pica.
package com.pica.cloud.foundation.test.server.annotation;

/**
 * @ClassName MyException
 * @Description TODO
 * @Author karl Kang
 * @Date 2019/5/7 17:17
 * @ModifyDate 2019/5/7 17:17
 * @Version 1.0
 */
public class MyException extends RuntimeException {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }
}
