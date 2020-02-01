package com.gitee.niuke.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author jianghao
 * @date 2020/2/1 13:47
 */
@Table(name = "sys_login_ticket")
@Data
public class LoginTicket implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String ticket;

    /**
     * 0-有效; 1-无效
     */
    private Integer status;

    private Date expired;

}
