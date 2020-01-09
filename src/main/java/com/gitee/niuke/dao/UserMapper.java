package com.gitee.niuke.dao;

import com.gitee.niuke.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author oliver
 * @date 2020/1/9 14:41
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户名查询用户
     * @param id id
     * @return user
     */
    User selectUserById(int id);

    /**
     * 根据用户名查询用户
     * @param username username
     * @return user
     */
    User selectUserByName(String username);

}
