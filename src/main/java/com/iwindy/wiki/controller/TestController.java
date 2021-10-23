package com.iwindy.wiki.controller;

import com.iwindy.wiki.domain.Test;
import com.iwindy.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
