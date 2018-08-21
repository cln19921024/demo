package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ChengLina on 2018/6/1.
 */
@Data
@NoArgsConstructor
public class BikePositionDO {
    private String uuid;
    private int  num;
    private long lat;
    private long lng;
    private Date createTime;
    private Date modifyTime;
}
