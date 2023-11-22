package com.yupi.usercenter.common;

/**
 * 通用错误码->自定义错误码
 */
public enum ErrorCode {
    SUCCESS(0,"OK",""),
    PARAM_ERROR(40000,"The request parameter is incorrect",""),
    NULL_ERROR(40001,"The request parameter is null",""),
    NOT_LOGIN(40100,"Not login",""),
    NO_AUTH(40101,"No auth",""),
    SYSTEM_ERROR(50000,"System internal error","");

    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述(详情)
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
