package com.yoreay.ares;

import com.yoreay.ares.entity.User;
import com.yoreay.ares.mapper.UserMapper;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by sanze on 2016/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-application.xml")
public class AppTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Cache ehcache;

    @Test
    public void test() {
        List<User> list = userMapper.selectAll();
        for (User user : list) {
            System.out.println(user);
        }

        list = userMapper.selectAll();

        ehcache.put(new Element("list", list));
        System.out.println(list.size());

        List<User> users = (List<User>) ehcache.get("list").getObjectValue();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
