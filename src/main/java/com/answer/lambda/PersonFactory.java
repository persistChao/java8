package com.answer.lambda;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 15 11
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
