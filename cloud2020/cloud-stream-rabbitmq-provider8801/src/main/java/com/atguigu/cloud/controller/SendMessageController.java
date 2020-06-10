package com.atguigu.cloud.controller;

import com.atguigu.cloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider provider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        String s = provider.send();
        return s;
    }
}
