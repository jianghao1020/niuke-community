package com.gitee.niuke.service.impl;

import com.gitee.niuke.pojo.Message;
import com.gitee.niuke.service.MessageService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jianghao
 * @date 2020/2/1 13:56
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public PageInfo<Message> findPage(Message message, int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Message> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Message> findList(Message message) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Message message) {

    }

    @Override
    public void add(Message message) {

    }

    @Override
    public Message findById(Integer id) {
        return null;
    }

    @Override
    public List<Message> findAll() {
        return null;
    }

}
