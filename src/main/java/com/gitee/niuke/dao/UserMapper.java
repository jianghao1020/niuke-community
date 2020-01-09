package com.gitee.niuke.dao;

import com.gitee.niuke.pojo.User;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author oliver
 * @date 2020/1/9 14:41
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户
     *
     * @param id id
     * @return user
     */
    User selectUserById(int id);

    /**
     * 根据用户名查询用户
     *
     * @param username username
     * @return user
     */
    User selectUserByName(String username);

}
