package com.sbc.manager.service.hystrixService;

import com.sbc.manager.service.DemoClientService;
import org.springframework.stereotype.Component;

/**
 * Created by supermrl on 2019/1/15.
 */
@Component
public class HystrixService implements DemoClientService{
    @Override
    public String getData() {
        return "Demo service调用失败";
    }
}
