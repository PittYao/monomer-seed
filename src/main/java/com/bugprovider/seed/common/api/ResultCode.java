package com.bugprovider.seed.common.api;

/**
 * 枚举了一些常用API操作码
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    TOKEN_NULL(402, "token为空"),
    FORBIDDEN(403, "没有相关权限"),


    GET_SUCCESS(200, "查询成功"),
    POST_SUCCESS(200, "操作成功"),
    PUT_SUCCESS(200, "修改成功"),
    DELETE_SUCCESS(200, "删除成功");


    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
