package com.qh.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: qh
 * @Date: 2019/2/19 11:11
 * @Description: value可以用serviceId代替，但是最好用value来指定要调用的服务,fallback是当程序错误的时候来回调的方法
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String index(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/index?name=" + name, String.class);
    }
}
