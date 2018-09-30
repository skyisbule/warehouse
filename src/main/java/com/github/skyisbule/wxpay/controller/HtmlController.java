package com.github.skyisbule.wxpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/login")
    public String d(){return "login";}

    @RequestMapping("/admin_require")
    public String admin_require(){return "admin_require";}

    @RequestMapping("/admin_warehouse")
    public String admin_warehouse(){return "admin_warehouse";}

    @RequestMapping("/index")
    public String index(){return "index";}

}
