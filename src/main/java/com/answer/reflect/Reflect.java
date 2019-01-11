package com.answer.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/11 11 37
 */
public class Reflect {

    @Test
    public void testReflect() {
        Class c1 = Student.class;
        Student student = new Student();
        Class c2 = student.getClass();
        try {
            Class c3 = Class.forName("com.answer.reflect.Student");
            System.out.println(c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c1);
        System.out.println(c2);
        try {
            Student stu = (Student) c1.newInstance();
            System.out.println(stu);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Method[] ms = c1.getMethods();
        System.out.println("student method size " + ms.length);
        for (int i =0;i<ms.length;i++) {
            System.out.println(ms[i].getAnnotatedReceiverType() + "  - " + ms[i].getName());
        }
    }
}
