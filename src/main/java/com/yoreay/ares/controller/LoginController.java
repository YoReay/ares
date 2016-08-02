package com.yoreay.ares.controller;

import com.yoreay.ares.entity.User;
import com.yoreay.ares.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanze on 2016/8/1.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("/login")
    public String login(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject curUser = SecurityUtils.getSubject();
        curUser.login(token);

        if (curUser.isAuthenticated()) {
            System.out.println("success");
        } else {
            token.clear();
        }
        return "redirect:/user/main";
    }

    @RequestMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:/";
    }
}
