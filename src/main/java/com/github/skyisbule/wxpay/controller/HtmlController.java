package com.github.skyisbule.wxpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/login")
    public String d(){return "login";}

    @RequestMapping("/admin_require")
    public String admin_require(){return "admin_require";}

    @RequestMapping("/admin_require_detail")
    public String admin_require_detail(){return "admin_require_detail";}

    @RequestMapping("/admin_warehouse")
    public String admin_warehouse(){return "admin_warehouse";}

    @RequestMapping("/admin_warehouse_detail")
    public String admin_warehouse_detail(){return "admin_warehouse_detail";}

    @RequestMapping("/admin_user")
    public String admin_user(){return "admin_user";}

    @RequestMapping("/admin_user_detail")
    public String admin_user_detail(){return "admin_user_detail";}

    @RequestMapping("/admin_warehouse_picture")
    public String admin_warehouse_picture(){return "admin_warehouse_picture";}

    @RequestMapping("/admin_communication_record")
    public String admin_communication_record(){return "admin_communication_record";}

    @RequestMapping("/index")
    public String index(){return "index";}

    @RequestMapping("/ipad")
    public String ipad(){return "ipad";}

}
