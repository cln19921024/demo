package com.example.gaodedemo.controller;

import com.example.gaodedemo.entity.BikePositionDO;
import com.example.gaodedemo.entity.PicDO;
import com.example.gaodedemo.service.BikeService;
import com.example.gaodedemo.service.PicService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by ChengLina on 2018/6/1.
 */
@Controller
public class indexController {
    @Autowired
    private BikeService bikeService;
    @Autowired
    private PicService picService;
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/getList")
    public String getList(){
        List<BikePositionDO> list=new ArrayList();
        list=bikeService.getList();
        System.out.println(list.size());
        return "index";
    }
    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
    @RequestMapping(value = "/getPublishPage")
    public String publish(){
        return "publish";
    }
    @RequestMapping(value = "/uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam MultipartFile file,@RequestParam String title){
      String originalFileName="";
      int m=new Random().nextInt(100)+10;
        System.out.println("m="+m);
        String path="D:/"+m+"b.pic";
        try {
            File newFile=new File(path);
            file.transferTo(newFile);
            String fileName=file.getName();

            String content=file.getContentType();
            originalFileName=file.getOriginalFilename();

        }catch (IOException e){
            e.printStackTrace();
        }
        PicDO picDO=new PicDO();
        picDO.setUuid(UUID.randomUUID().toString());
        picDO.setClassId(UUID.randomUUID().toString());
        picDO.setTitle(title);
        picDO.setPicLink(path);
        picService.uploadFile(picDO);
        return "发布成功";

    }
}
