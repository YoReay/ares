package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}