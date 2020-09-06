package com.imooc.springmvc.cotroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    /**
     * produces:避免返回json中文乱码
     * @return
     */
    @GetMapping(value = "/t",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String test(){
        return "焦其民";
    }
}
