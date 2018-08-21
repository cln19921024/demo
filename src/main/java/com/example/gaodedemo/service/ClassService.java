package com.example.gaodedemo.service;

import com.example.gaodedemo.entity.ClassDO;
import com.example.gaodedemo.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChengLina on 2018/6/11.
 */
@Service
public class ClassService {
    @Autowired
    private ClassMapper classMapper;
    public void  insertClass(ClassDO classDO){
        classMapper.insertClass(classDO);
    }
}
