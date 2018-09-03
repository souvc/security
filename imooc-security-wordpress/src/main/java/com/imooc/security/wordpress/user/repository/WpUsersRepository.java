package com.imooc.security.wordpress.user.repository;

import com.imooc.security.wordpress.common.BaseRepository;
import com.imooc.security.wordpress.user.domain.WpUsers;
import org.springframework.stereotype.Repository;

/**
 *
 * 用户接口
 * @author souvc
 */

@Repository
public interface WpUsersRepository extends BaseRepository {

    WpUsers findByuserLoginAndUserStatus(String userLogin, int i);
}
