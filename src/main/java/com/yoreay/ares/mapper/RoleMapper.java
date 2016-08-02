package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.Role;
import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);


    List<Role> selectByUserId(Long userId);
}