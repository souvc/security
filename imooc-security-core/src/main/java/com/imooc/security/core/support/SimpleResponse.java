/**
 *
 */
package com.imooc.security.core.support;

/**
 * 简单响应的封装类
 *
 * @author zhailiang
 */
public class SimpleResponse {

    private int code=200;
    private Object data;
    private String message="";

    public SimpleResponse(String message) {
        this.message = message;
    }

    public SimpleResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public SimpleResponse(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
