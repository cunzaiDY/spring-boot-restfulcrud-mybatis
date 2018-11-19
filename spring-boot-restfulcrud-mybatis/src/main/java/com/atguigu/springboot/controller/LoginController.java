package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && ("111").equals(password)){
            //将用户名存到session域中，登录验证时会用到
            session.setAttribute("loginUser",username);
            //重定向到管理页面，使用重定向是为了用户刷新时，表单重复提交问题
            return "redirect:/main.html";
        }else{
            //将错误信息存到map中，前台页面可展示
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
}
