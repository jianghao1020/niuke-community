package com.gitee.niuke.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 */
@Data
@Table(name = "sys_comment")
public class Comment {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "entity_type")
    private Integer entityType;

    @Column(name = "entity_id")
    private Integer entityId;

    @Column(name = "target_id")
    private Integer targetId;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

}
