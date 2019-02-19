package com.qh.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: qh
 * @Date: 2019/2/19 15:21
 * @Description: @ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "eureka-client")
public interface SchedualService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getIndexFromClientOne(@RequestParam(value = "name") String name);
}
