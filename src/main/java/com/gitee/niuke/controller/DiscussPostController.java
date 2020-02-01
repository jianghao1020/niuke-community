package com.gitee.niuke.controller;

import com.gitee.niuke.entity.Result;
import com.gitee.niuke.entity.StatusCode;
import com.gitee.niuke.pojo.DiscussPost;
import com.gitee.niuke.service.DiscussPostService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author jianghao
 * @date 2020/1/28 20:19
 */
@Controller
@RequestMapping("/discussPost")
public class DiscussPostController {

    @Resource
    private DiscussPostService discussPostService;

    @GetMapping(value = "/selectDiscussPosts/{page}/{size}/{userId}")
    @ResponseBody
    public Result selectDiscussPosts(@PathVariable int page, @PathVariable int size, @PathVariable int userId) {
        PageInfo<DiscussPost> discussPostPageInfo = discussPostService.selectDiscussPosts(page, size, userId);
        return new Result(true, StatusCode.OK, "查询成功", discussPostPageInfo);
    }

}
