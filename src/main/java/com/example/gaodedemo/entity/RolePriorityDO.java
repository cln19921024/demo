package com.example.gaodedemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ChengLina on 2018/8/21.
 */
@Data
@NoArgsConstructor
public class RolePriorityDO {
    private String uuid;
    private String roleId;
    private String priId;
    private Boolean enabled;
    private Date createTime;
    private Date modifyTime;
}
