package com.answer.lambda.list;

import lombok.*;

/**
 * @descreption
 * @Author answer
 * @Date 2019/6/24 15 39
 */

@Data
@ToString
@NoArgsConstructor()
public class User {
    @NonNull
    private int age;

    private String name;

    public User(int age , String name) {
        this.name = name;
        this.age = age;
    }

}
