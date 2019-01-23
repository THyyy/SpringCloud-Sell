package com.example.user.service;

import com.example.user.dataobject.UserInfo;

/**
 * @author THY
 * @date 2018/12/16
 */
public interface UserService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
