package com.pocketdigi.web.controller;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.pocketdigi.client.ConfigService;
import com.pocketdigi.dal.mapper.ConfigPOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Exception on 2017/4/26.
 */
@RestController
public class IndexController {

//    @DubboConsumer
//    private ConfigService configService;

    @RequestMapping(value = "/")
    public Object index() {

//        return configService.getConfig(1);
        return null;
    }
}
