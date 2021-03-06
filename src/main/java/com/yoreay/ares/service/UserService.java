package com.yoreay.ares.service;

import com.yoreay.ares.entity.User;

import java.util.Map;

/**
 * Created by sanze on 2016/7/28.
 */
public interface UserService {

    User getUserByUsername(String username);

    User getUserById(Long id);

    Map<String, Object> getAllUser();
}
