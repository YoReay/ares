package com.yoreay.ares.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Permission {
    private Long id;

    private String name;

    private String key;

    private Long parentId;

    private String url;

    private String description;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private Boolean isDeleted;
}