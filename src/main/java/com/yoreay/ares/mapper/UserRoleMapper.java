package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.UserRole;
import java.util.List;

public interface UserRoleMapper {
    int insert(UserRole record);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}