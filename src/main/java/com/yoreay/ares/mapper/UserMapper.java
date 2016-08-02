package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.User;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    @Cacheable(value = "userCache")
    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectById(Long id);

    User selectByUsername(String username);
}