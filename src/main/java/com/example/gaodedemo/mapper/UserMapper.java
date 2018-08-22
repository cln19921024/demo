package com.example.gaodedemo.mapper;

import com.example.gaodedemo.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by ChengLina on 2018/8/21.
 */
@Mapper
@Component
public interface UserMapper {
    UserDO findUserByName(String username);
}
