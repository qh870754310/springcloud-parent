package com.qh.eurekaribbon.controller;

import com.qh.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qh
 * @Date: 2019/2/19 13:55
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/index")
    public String index(@RequestParam String name) {
        return helloService.index(name);
    }
}
