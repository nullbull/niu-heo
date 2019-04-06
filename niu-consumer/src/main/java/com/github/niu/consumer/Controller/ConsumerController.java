package com.github.niu.consumer.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auth justinniu
 * @Date 2018/12/20
 * @Desc
 */
@RestController
@Slf4j
@RefreshScope
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    @Value("${niu.test}")
    private String zwt;
    @RequestMapping("/hello/{zz}")
    public String test(@PathVariable(value = "zz") String zz) {
        return helloRemote.hello(zz);
    }

    @RequestMapping("/test")
    public String hhh() {
        log.info(zwt);
        return "13";
    }
}
