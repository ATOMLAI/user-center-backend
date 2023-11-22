package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * 如果要使用JSON格式的参数的话,最好封装一个对象来记录所有的请求参数
 */
@Data //生成get,set方法
public class UserLoginRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = 4772243295366861457L;

    private String userAccount;
    private String userPassword;
}
