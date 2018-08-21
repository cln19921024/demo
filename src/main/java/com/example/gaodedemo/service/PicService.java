package com.example.gaodedemo.service;

import com.example.gaodedemo.entity.PicDO;
import com.example.gaodedemo.mapper.PicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChengLina on 2018/6/11.
 */
@Service
public class PicService {
    @Autowired
    private PicMapper picMapper;
    public void uploadFile(PicDO picDO){
      picMapper.insertPic(picDO);
    }
}
