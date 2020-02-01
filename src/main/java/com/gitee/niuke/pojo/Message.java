package com.gitee.niuke.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author jianghao
 * @date 2020/2/1 13:49
 */
@Data
@Table(name = "sys_message")
public class Message implements Serializable {

    @Id
    private Integer id;

    private Integer fromId;

    private Integer toId;

    private String conversationId;


    private String content;

    /**
     * 0-未读;1-已读;2-删除
     */
    private Integer status;

    private Date createTime;

}
