package com.gitee.niuke.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author jianghao
 * @date 2020/1/27 17:16
 */
@Data
@Table(name = "sys_discuss_post")
public class DiscussPost {

    @Id
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    private String title;

    private String content;

    private Integer type;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "comment_count")
    private Integer commentCount;

    private Double score;

}
