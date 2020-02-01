package com.gitee.niuke.service;

import com.gitee.niuke.pojo.Message;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author jianghao
 * @date 2020/2/1 13:53
 */
public interface MessageService {

    /**
     * SysMessage多条件分页查询
     *
     * @param message message
     * @param page    page
     * @param size    size
     * @return pageInfo
     */
    PageInfo<Message> findPage(Message message, int page, int size);

    /**
     * SysMessage分页查询
     *
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Message> findPage(int page, int size);

    /**
     * SysMessage多条件搜索方法
     *
     * @param message message
     * @return list
     */
    List<Message> findList(Message message);

    /**
     * 删除SysMessage
     *
     * @param id id
     */
    void delete(Integer id);

    /**
     * 修改SysMessage数据
     *
     * @param message message
     */
    void update(Message message);

    /**
     * 新增SysMessage
     *
     * @param message message
     */
    void add(Message message);

    /**
     * 根据ID查询SysMessage
     *
     * @param id id
     * @return message
     */
    Message findById(Integer id);

    /**
     * 查询所有SysMessage
     *
     * @return list
     */
    List<Message> findAll();

}
