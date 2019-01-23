package com.example.user.repository;

import com.example.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author THY
 * @date 2018/12/16
 */

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String opernid);
}
