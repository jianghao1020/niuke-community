package com.gitee.niuke.service.impl;

import com.gitee.niuke.dao.DiscussPostMapper;
import com.gitee.niuke.pojo.DiscussPost;
import com.gitee.niuke.service.DiscussPostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jianghao
 * @date 2020/1/28 20:16
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Resource
    private DiscussPostMapper discussPostMapper;

    @Override
    public PageInfo<DiscussPost> selectDiscussPosts(int page, int size, int userId) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(discussPostMapper.selectDiscussPosts(userId));
    }
}
