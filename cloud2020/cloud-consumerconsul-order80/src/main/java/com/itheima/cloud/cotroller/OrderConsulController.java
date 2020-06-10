package com.itheima.cloud.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderConsulController {


    public static final String INVOKE_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment(){
       String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
       return result;
    }
}