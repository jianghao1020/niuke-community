package com.gitee.niuke.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author oliver
 * @date 2020/1/9 14:34
 */
@Data
@ToString
public class User {

    private Long id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private Integer type;

    private Integer status;

    private String activationCode;

    private String headerUrl;

    private Date createTime;

}
