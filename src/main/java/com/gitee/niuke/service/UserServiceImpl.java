package com.gitee.niuke.service;

import com.gitee.niuke.dao.UserMapper;
import com.gitee.niuke.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2020/1/9 17:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private ExampleService exampleService;

    @Resource
    private UserMapper userMapper;

    @Override
    public PageInfo<User> findPage(User user, int page, int size) {
        // 分页
        PageHelper.startPage(page, size);
        // 搜索条件构建
        Example example = exampleService.createUserExample(user);
        // 执行搜索
        return new PageInfo<>(userMapper.selectByExample(example));
    }

    @Override
    public PageInfo<User> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<User> findList(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void add(User user) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

}
