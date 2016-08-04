package com.yoreay.ares.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class User implements Serializable{
    private Long id;

    private Date created;

    private Date modified;

    private Boolean isDeleted;

    private String username;

    private String password;

    private Long deptId;

    private List<Role> roles;

    @JsonProperty(value = "OrderID")
    private String orderID;
}