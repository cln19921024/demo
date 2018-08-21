package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

/**
 * Created by ChengLina on 2018/8/21.
 */
@NoArgsConstructor
@Data
public class UserDO {
    private String uuid;
    private String username;
    private String password;
    private Date createTime;
    private Date modifyTime;
}
