package com.imooc.security.wordpress.user.service;

import com.imooc.security.wordpress.user.domain.WpUsers;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface WpUsersService {

    /**
     * 根据用户名查找用户基本信息
     * @param username
     * @return
     */
     WpUsers loadUserByUsername(String username);

}
