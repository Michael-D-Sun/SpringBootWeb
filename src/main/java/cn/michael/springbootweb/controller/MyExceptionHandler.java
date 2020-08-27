package cn.michael.springbootweb.controller;

import cn.michael.springbootweb.exception.UserNotExist;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExist.class)
    public String handleException(Exception e, HttpServletRequest req){
        Map<String, Object> map = new HashMap<>();
        req.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user doesn't exist");

        return "forward:/error";
    }
}
