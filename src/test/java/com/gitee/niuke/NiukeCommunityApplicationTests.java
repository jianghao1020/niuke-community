package com.gitee.niuke;

import com.gitee.niuke.dao.UserMapper;
import com.gitee.niuke.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class NiukeCommunityApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectUserById(1);
        System.out.println(user);
    }

}
