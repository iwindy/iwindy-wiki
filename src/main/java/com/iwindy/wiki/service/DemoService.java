package com.iwindy.wiki.service;

import com.iwindy.wiki.domain.Demo;
import com.iwindy.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public  List<Demo> list(){
        return  demoMapper.selectByExample(null);
    }
}
