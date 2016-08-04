package com.yoreay.ares;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoreay.ares.entity.User;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by sanze on 2016/7/27.
 */
@Component
public class App {

    public void addData() {
        System.out.println("addData");
    }

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setOrderID("123");

        String ss = new ObjectMapper().writeValueAsString(user);
        System.out.println(ss);
        User user1 = new ObjectMapper().readValue(ss, User.class);
        System.out.println(user1);
    }
}
