package com.yoreay.ares.controller;

import com.yoreay.ares.entity.User;
import com.yoreay.ares.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sanze on 2016/7/28.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public String info(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        SecurityUtils.getSubject().isPermitted("b");
        model.addAttribute("user", user);
        return "info";
    }

    @RequiresRoles("xiaochou")
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
