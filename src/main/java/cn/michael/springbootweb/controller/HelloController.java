package cn.michael.springbootweb.controller;

import cn.michael.springbootweb.exception.UserNotExist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hell(String name){
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("hello", "Hello Spring Boot");
        return "success";
    }
}
