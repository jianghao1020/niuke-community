package com.gitee.niuke.controller;

import com.gitee.niuke.entity.Result;
import com.gitee.niuke.entity.StatusCode;
import com.gitee.niuke.pojo.User;
import com.gitee.niuke.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2020/1/9 17:45
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/search/{page}/{size}")
    @ResponseBody
    public Result findPage(@RequestBody(required = false) User user, @PathVariable int page, @PathVariable int size) {
        // 调用UserService实现分页条件查询User
        PageInfo<User> pageInfo = userService.findPage(user, page, size);
        return new Result(true, StatusCode.OK, "查询成功", pageInfo);
    }

    @GetMapping
    @ResponseBody
    public Result findAll() {
        List<User> all = userService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", all);
    }

}
