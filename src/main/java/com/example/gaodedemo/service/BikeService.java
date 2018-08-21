package com.example.gaodedemo.service;

import com.example.gaodedemo.entity.BikePositionDO;
import com.example.gaodedemo.mapper.BikePositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ChengLina on 2018/6/1.
 */
@Service
public class BikeService {
    @Autowired
    private BikePositionMapper bikePosition;
    public List<BikePositionDO> getList(){
        return bikePosition.getList();
    }
}
