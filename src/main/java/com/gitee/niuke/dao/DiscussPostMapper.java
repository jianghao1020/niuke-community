package com.gitee.niuke.dao;

import com.gitee.niuke.pojo.DiscussPost;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author jianghao
 * @date 2020/1/28 20:13
 */
public interface DiscussPostMapper extends Mapper<DiscussPost> {

    /**
     * 根据用户id查询评论文章
     *
     * @param userId userId
     * @return list
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId);

}
