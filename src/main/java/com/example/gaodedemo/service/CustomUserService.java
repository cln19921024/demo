package com.example.gaodedemo.service;

import com.example.gaodedemo.entity.SeUser;
import com.example.gaodedemo.entity.UserDO;
import com.example.gaodedemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ChengLina on 2018/8/21.
 */
@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    private UserDO userDO;
    @Autowired
    private UserMapper userMapper;


    @Override

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        userDO=userMapper.findUserByName(s);

        if (userDO==null){
            throw new UsernameNotFoundException("username"+s+"not found");
        }
        SeUser seUser=new SeUser(userDO);
        Collection<SimpleGrantedAuthority> authorities=new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return seUser;
    }
}
