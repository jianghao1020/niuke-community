package com.gitee.niuke.service;

import com.gitee.niuke.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2020/1/9 17:23
 */
public interface UserService {

    /**
     * User多条件分页查询
     *
     * @param user user
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<User> findPage(User user, int page, int size);

    /**
     * User分页查询
     *
     * @param page
     * @param size
     * @return
     */
    PageInfo<User> findPage(int page, int size);

    /**
     * User多条件搜索方法
     *
     * @param user
     * @return
     */
    List<User> findList(User user);

    /**
     * 删除User
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 修改User数据
     *
     * @param user
     */
    void update(User user);

    /**
     * 新增User
     *
     * @param user
     */
    void add(User user);

    /**
     * 根据ID查询User
     *
     * @param id
     * @return
     */
    User findById(Long id);

    /***
     * 查询所有User
     * @return
     */
    List<User> findAll();

}
