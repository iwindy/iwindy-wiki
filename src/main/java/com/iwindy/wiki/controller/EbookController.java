package com.iwindy.wiki.controller;

import com.iwindy.wiki.domain.Ebook;
import com.iwindy.wiki.req.EbookReq;
import com.iwindy.wiki.resp.CommonResp;
import com.iwindy.wiki.resp.EbookResp;
import com.iwindy.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp<List<EbookResp>> list(EbookReq ebookReq){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp>  list = ebookService.list(ebookReq);
        resp.setContent(list);
        return resp;
    }
}
