package com.qh.eurekahystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: qh
 * @Date: 2019/2/20 13:57
 * @Description: @HystrixCommand注解,该注解对该方法创建了熔断器的功能,并指定了fallbackMethod熔断方法
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError")
    public String index(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/index?name=" + name, String.class);
    }

    public String indexError(String name) {
        return "hi " + name + ",sorry, error!";
    }
}
