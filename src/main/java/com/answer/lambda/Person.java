package com.answer.lambda;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 14 24
 */
public class Person {

    String firstName;
    String lastName;

    public Person(){}

    public Person(String  firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
