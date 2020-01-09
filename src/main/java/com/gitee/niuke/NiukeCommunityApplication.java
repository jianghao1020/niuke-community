package com.gitee.niuke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author oliver
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.gitee.niuke.dao"})
public class NiukeCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiukeCommunityApplication.class, args);
    }

}