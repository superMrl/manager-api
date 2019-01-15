package com.sbc.manager.service;


import com.sbc.manager.service.hystrixService.HystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="manager-service",fallback = HystrixService.class)
@Service
public interface DemoClientService {

    @RequestMapping("/getData")
    public String getData();
}
