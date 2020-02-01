package com.gitee.niuke.service;

import com.gitee.niuke.pojo.DiscussPost;
import com.github.pagehelper.PageInfo;

/**
 * @author jianghao
 * @date 2020/1/28 20:16
 */
public interface DiscussPostService {

    /**
     * 分页查询讨论帖子
     *
     * @param page   page
     * @param size   size
     * @param userId userId
     * @return pageInfo
     */
    PageInfo<DiscussPost> selectDiscussPosts(int page, int size, int userId);
}
