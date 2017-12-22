package com.example.jpamysqlspringboot.controller;

import com.example.jpamysqlspringboot.dao.repo;
import com.example.jpamysqlspringboot.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class controller {

    @Autowired
    private repo repos;

    @RequestMapping("/")
    @ResponseBody
    public  List<user> func(){
        List<user> list = repos.findAll();
        return list;
    }

}
