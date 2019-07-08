package com.answer.lambda.list;

import lombok.Data;
import lombok.ToString;

/**
 * @descreption
 * @Author answer
 * @Date 2019/7/8 09 50
 */

@Data
@ToString
public class User1 {
    private String name;

    private int age;

    public User1(String name , int age) {
        this.name = name;
        this.age = age;
    }
}
