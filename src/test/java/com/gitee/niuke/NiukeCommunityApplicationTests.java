package com.gitee.niuke;

import com.gitee.niuke.dao.DiscussPostMapper;
import com.gitee.niuke.dao.UserMapper;
import com.gitee.niuke.pojo.DiscussPost;
import com.gitee.niuke.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class NiukeCommunityApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private DiscussPostMapper discussPostMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectUserById(1);
        System.out.println(user);
    }

    @Test
    void contextLoads01() {
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }

    @Test
    void contextLoads02() {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user);
    }

    @Test
    void contextLoads03() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(101);
        discussPosts.forEach(System.out::println);
    }

}
