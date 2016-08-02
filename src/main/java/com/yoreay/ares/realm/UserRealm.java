package com.yoreay.ares.realm;

import com.yoreay.ares.entity.Permission;
import com.yoreay.ares.entity.Role;
import com.yoreay.ares.entity.User;
import com.yoreay.ares.service.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.config.ReflectionBuilder;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.style.ToStringStyler;
import org.springframework.util.ReflectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by sanze on 2016/7/28.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) super.getAvailablePrincipal(principalCollection);
        User user = userService.getUserByUsername(username);
        Set<String> roles = new HashSet<>();
        Set<String> permissions = new HashSet<>();
        if (user != null) {
            if (CollectionUtils.isNotEmpty(user.getRoles())) {
                for (Role role : user.getRoles()) {
                    roles.add(role.getName());
                    if (CollectionUtils.isNotEmpty(role.getPermissions())) {
                        permissions.addAll(role.getPermissions().stream().map(Permission::getKey).collect(Collectors.toList()));
                    }
                }
            }
        } else {
            throw new AuthorizationException();
        }
        SimpleAuthorizationInfo authorInfo = new SimpleAuthorizationInfo();
        authorInfo.setRoles(roles);
        authorInfo.setStringPermissions(permissions);

        return authorInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("验证当前Subject时获取到token时为" + token);
        User user = userService.getUserByUsername(token.getUsername());
        if (user != null) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
            return authcInfo;
        } else {
            throw new AuthenticationException();
        }
    }
}
