package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ChengLina on 2018/8/21.
 */
@NoArgsConstructor
@Data
@Component
public class UserDO {
    private String uuid;
    private String username;
    private String password;
    private Date createTime;
    private Date modifyTime;


}
