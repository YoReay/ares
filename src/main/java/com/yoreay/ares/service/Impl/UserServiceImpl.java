package com.yoreay.ares.service.Impl;

import com.yoreay.ares.entity.Permission;
import com.yoreay.ares.entity.Role;
import com.yoreay.ares.entity.User;
import com.yoreay.ares.mapper.PermissionMapper;
import com.yoreay.ares.mapper.RoleMapper;
import com.yoreay.ares.mapper.UserMapper;
import com.yoreay.ares.service.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sanze on 2016/7/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public User getUserByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        List<Role> roles = roleMapper.selectByUserId(user.getId());
        if (CollectionUtils.isNotEmpty(roles)) {
            for (Role role : roles) {
                List<Permission> permissions = permissionMapper.selectByRoleId(role.getId());
                if (CollectionUtils.isNotEmpty(permissions)) {
                    role.setPermissions(permissions);
                }
            }
            user.setRoles(roles);
        }
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
