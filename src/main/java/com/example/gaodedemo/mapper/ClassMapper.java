package com.example.gaodedemo.mapper;

import com.example.gaodedemo.entity.ClassDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by ChengLina on 2018/6/11.
 */
@Mapper
@Component
public interface ClassMapper {
    void insertClass(ClassDO classDO);
}
