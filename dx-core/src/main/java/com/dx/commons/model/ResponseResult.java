package com.dx.commons.model;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 13:43
 */
public class ResponseResult<T> {

    /**
     * 成功
     */
    private static final String SUCCESS = "1";

    /**
     * 失败
     */
    private static final String FAIL = "0";

    /**
     * 状态码:0 失败，1：成功
     */
    private String code;

    /**
     * 消息描述
     */
    private String msg;

    /**
     * 数据结果
     */
    private T data;

    public ResponseResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult<T> SUCCESS(T data) {
        return new ResponseResult<T>(SUCCESS, "", data);
    }

    public static <T> ResponseResult<T> SUCCESS(String msg, T data) {
        return new ResponseResult<T>(SUCCESS, msg, data);
    }

    public static <T> ResponseResult<T> FAIL(String msg) {
        return new ResponseResult<T>(FAIL, msg, null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
