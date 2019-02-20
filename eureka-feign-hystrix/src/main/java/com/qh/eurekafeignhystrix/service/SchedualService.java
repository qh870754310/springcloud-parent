package com.qh.eurekafeignhystrix.service;

import com.qh.eurekafeignhystrix.component.SchedualServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: qh
 * @Date: 2019/2/20 14:46
 * @Description: @ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "eureka-client", fallback = SchedualServiceHystrix.class)
public interface SchedualService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getIndexFromClientOne(@RequestParam(value = "name") String name);
}
