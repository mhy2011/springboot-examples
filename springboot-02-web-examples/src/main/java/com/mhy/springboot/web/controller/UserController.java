package com.mhy.springboot.web.controller;

import com.mhy.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mahaiyuan
 * @ClassName: UserController
 * @date 2018-08-10 下午11:53
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回ModelAndView对象
     * @return
     */
    @RequestMapping("/01")
    public String demo01() {
        return "user_01";
    }

    @RequestMapping("/02")
    public ModelAndView demo02() {
        ModelAndView mav = new ModelAndView();
        //指定视图文件
        mav.setViewName("user_02");
        User user = new User(1, "张三", "男");
        mav.addObject("user", user);
        return mav;
    }

}
