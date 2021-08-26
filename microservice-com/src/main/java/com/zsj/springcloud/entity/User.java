package com.zsj.springcloud.entity;

import lombok.Data;

/**
 * @author zshujian
 * @version 1.0
 * @date 2021/8/25 14:33
 */
@Data
public class User {

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private int id;
    private String name;
    private int age;

}
