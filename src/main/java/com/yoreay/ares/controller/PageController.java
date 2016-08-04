package com.yoreay.ares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanze on 2016/8/3.
 */
@Controller
public class PageController {

    @RequestMapping("/crm")
    public String crm() {
        return "crm";
    }
}
