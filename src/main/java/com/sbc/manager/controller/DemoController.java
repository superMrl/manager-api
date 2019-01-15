package com.sbc.manager.controller;

import com.sbc.manager.service.DemoClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoClientService demoClientService;

    @RequestMapping("/getData")
    public String getData(){
        return demoClientService.getData();
    }

}
