package com.qh.eurekafeignhystrix.component;

import com.qh.eurekafeignhystrix.service.SchedualService;
import org.springframework.stereotype.Component;

/**
 * @Author: qh
 * @Date: 2019/2/20 14:51
 * @Description:
 */
@Component
public class SchedualServiceHystrix implements SchedualService {

    @Override
    public String getIndexFromClientOne(String name) {
        return "sorry " + name;
    }
}
