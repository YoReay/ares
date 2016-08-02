package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.Permission;
import java.util.List;

public interface PermissionMapper {
    int insert(Permission record);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);


    List<Permission> selectByRoleId(Long roleId);
}