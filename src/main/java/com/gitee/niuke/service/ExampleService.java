package com.gitee.niuke.service;

import com.gitee.niuke.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

/**
 * 构建查询对象
 *
 * @author oliver
 * @date 2020/1/9 17:30
 */
@Service
public class ExampleService {

    public Example createUserExample(User user) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if (user != null) {
            //
            if (!StringUtils.isEmpty(user.getId())) {
                criteria.andEqualTo("id", user.getId());
            }
            //
            if (!StringUtils.isEmpty(user.getUsername())) {
                criteria.andLike("username", "%" + user.getUsername() + "%");
            }
            //
            if (!StringUtils.isEmpty(user.getPassword())) {
                criteria.andEqualTo("password", user.getPassword());
            }
            //
            if (!StringUtils.isEmpty(user.getSalt())) {
                criteria.andEqualTo("salt", user.getSalt());
            }
            //
            if (!StringUtils.isEmpty(user.getEmail())) {
                criteria.andEqualTo("email", user.getEmail());
            }
            // 0-普通用户; 1-超级管理员; 2-版主;
            if (!StringUtils.isEmpty(user.getType())) {
                criteria.andEqualTo("type", user.getType());
            }
            // 0-未激活; 1-已激活;
            if (!StringUtils.isEmpty(user.getStatus())) {
                criteria.andEqualTo("status", user.getStatus());
            }
            //
            if (!StringUtils.isEmpty(user.getActivationCode())) {
                criteria.andEqualTo("activationCode", user.getActivationCode());
            }
            //
            if (!StringUtils.isEmpty(user.getHeaderUrl())) {
                criteria.andEqualTo("headerUrl", user.getHeaderUrl());
            }
            //
            if (!StringUtils.isEmpty(user.getCreateTime())) {
                criteria.andEqualTo("createTime", user.getCreateTime());
            }
        }
        return example;
    }

}
