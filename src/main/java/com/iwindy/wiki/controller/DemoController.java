package com.iwindy.wiki.controller;

import com.iwindy.wiki.domain.Demo;
import com.iwindy.wiki.mapper.DemoMapper;
import com.iwindy.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoMapper demoMapper;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
