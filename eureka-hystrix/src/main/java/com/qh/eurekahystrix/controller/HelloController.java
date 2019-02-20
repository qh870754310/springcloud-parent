package com.qh.eurekahystrix.controller;

import com.qh.eurekahystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qh
 * @Date: 2019/2/20 14:13
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
