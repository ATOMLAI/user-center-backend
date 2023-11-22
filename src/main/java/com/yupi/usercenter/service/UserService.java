package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * 用户服务
* @author Natalia_Lai
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-11-09 04:26:30
*/
public interface UserService extends IService<User> {

    /**
     * 用户注释(写完接收参数之后再写注释,注释类型是java doc的注释类型)
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @param planetCode
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request ->HttpServletRequest对象代表客户端请求,通过调用这个对象的方法,可以获得客户端的信息
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originalUser
     * @return
     */
    User getSafetyUser(User originalUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
