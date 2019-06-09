package com.qf.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangming
 * @Date 2019/6/10
 */
@Controller
@RequestMapping("our")
public class OutController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
