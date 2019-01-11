package com.answer.reflect;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/11 11 36
 */
public class Student {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void printStu(){
        System.out.println("this is a private void method!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
