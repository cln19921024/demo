package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ChengLina on 2018/8/21.
 */
@Data
@NoArgsConstructor
public class RoleDO {
    private String uuid;
    private String name;
    private Date createTime;
    private Date modifyTime;
}
