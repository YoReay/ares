package com.yoreay.ares.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private Long id;

    private Date created;

    private Date modified;

    private Boolean isDeleted;

    private String username;

    private String password;

    private Long deptId;
}