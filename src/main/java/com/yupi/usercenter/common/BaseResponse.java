package com.yupi.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * 通用响应对象->序列化将对象转化为字节流进行保存或传输
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    //代表响应的状态码，通常用于指示请求的处理结果或状态
    private int code;
    //代表响应中携带的数据。这里使用了泛型 T，表示可以是任意类型的数据。
    private T data;
    //代表响应的文本消息，通常用于携带一些描述性的信息，例如错误信息或成功消息。
    private String message;

    private String description;

    //构造函数->在创建类的实例的时候进行初始化
    public BaseResponse(int code, T data, String message,String  description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    //构造函数
    public BaseResponse(int code, T data, String message) {
        this(code, data, message,"");
    }
    public BaseResponse(int code,T data) {
        this(code,data,"","");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(),errorCode.getDescription());
    }


}
