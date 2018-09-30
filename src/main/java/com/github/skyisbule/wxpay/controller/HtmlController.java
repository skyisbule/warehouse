package com.github.skyisbule.wxpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/login")
    public String d(){return "login";}

    @RequestMapping("/test")
    public String test(){return "admin_require";}

}
