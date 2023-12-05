package com.hniit.controller;

import com.hniit.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class UserController {

    //通过HttpServletRequest获取username
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request) {
        System.out.println("username=");
    }

    //通过参数获取username和id
    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId() {
        System.out.println("username=" + " id=");
    }

    //通过restful风格获取username
    @RequestMapping("/user/{name}")
    public void getPathVariable() {
        System.out.println("username=");
    }


    /**
     * 登录页面跳转
     */
    @RequestMapping("/register")
    public String registerUser() {
        return "register";
    }

    /**
     * 接收表单用户信息
     */
    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username="+username+",password="+password);

    }

    /**
     * 使用自定义类型数据绑定日期数据
     */
    @RequestMapping("/getBirthday1")
    public void getBirthday1(Date birthday) {
        System.out.println("birthday="+birthday);
    }

    /**
     * 使用@DateTimeFormat注解绑定日期数据
     */
    @RequestMapping("/getBirthday2")
    public void getBirthday2(@DateTimeFormat(
            pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println("birthday=" + birthday);
    }
}

