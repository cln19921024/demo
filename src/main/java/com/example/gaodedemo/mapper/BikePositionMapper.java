package com.example.gaodedemo.mapper;

import com.example.gaodedemo.entity.BikePositionDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ChengLina on 2018/6/1.
 */
@Mapper
@Component
public interface BikePositionMapper {
    List<BikePositionDO> getList();
}
