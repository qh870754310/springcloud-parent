package com.qh.eurekafeign.controller;

import com.qh.eurekafeign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qh
 * @Date: 2019/2/19 15:20
 * @Description:
 */
@RestController
public class IndexController {

    /**
     * 编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
     */
    @Autowired
    SchedualService schedualService;

    @GetMapping(value = "/printIndex")
    public String printIndex(@RequestParam String name) {
        return schedualService.getIndexFromClientOne(name);
    }
}
