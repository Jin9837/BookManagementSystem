package com.springboot_8.domain;

import lombok.Data;

// 为当前实体类在编译期设置对应的get/set方法，toString方法，hashCode方法，equals方法等
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
