package com.yoreay.ares.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Role {
    private Long id;

    private String name;

    private String key;

    private String description;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private Boolean isDeleted;

    private List<Permission> permissions;
}