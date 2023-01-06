package com.shangan.trade.goods.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j          // for writing log
@Controller     // for denoting as controller
public class GoodsController {

    @RequestMapping("/goods/test")
    @ResponseBody
    public String test() {

        log.info("hello world test");
        return "hello world java test";
    }
}
