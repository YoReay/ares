package com.yoreay.ares.mapper;

import com.yoreay.ares.entity.RolePermission;
import java.util.List;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    List<RolePermission> selectAll();

    int updateByPrimaryKey(RolePermission record);
}