package com.Timothy.wiki.controller;

import com.Timothy.wiki.domain.Test;
import com.Timothy.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, " + name;
    }
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
