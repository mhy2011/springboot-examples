package com.mhy.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mahaiyuan
 * @ClassName: UserController
 * @date 2018-08-10 下午11:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/01")
    public String demo01() {
        return "user_01";
    }

}
