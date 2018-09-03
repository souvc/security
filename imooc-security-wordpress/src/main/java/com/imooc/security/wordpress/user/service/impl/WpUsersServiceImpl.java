package com.imooc.security.wordpress.user.service.impl;

import com.imooc.security.wordpress.user.domain.WpUsers;
import com.imooc.security.wordpress.user.repository.WpUsersRepository;
import com.imooc.security.wordpress.user.service.WpUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *  实现类
 * @author souvc
 */
@Service
public class WpUsersServiceImpl implements WpUsersService {

    @Resource
    private  WpUsersRepository wpUsersRepository;

    @Override
    public WpUsers loadUserByUsername(String username) {
        WpUsers wpUsers= wpUsersRepository.findByuserLoginAndUserStatus(username,0);
        return wpUsers;
    }
}
