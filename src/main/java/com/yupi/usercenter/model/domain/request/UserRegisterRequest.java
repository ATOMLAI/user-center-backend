package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * 如果要使用JSON格式的参数的话,最好封装一个对象来记录所有的请求参数
 */
@Data //生成get,set方法
public class UserRegisterRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;

}
