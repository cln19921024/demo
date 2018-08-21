package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ChengLina on 2018/6/8.
 */
@Data
@NoArgsConstructor
public class PicDO {
    private String uuid;
    private String classId;
    private String title;
    private String picLink;
    private Date createTime;
    private Date modifyTime;
}
