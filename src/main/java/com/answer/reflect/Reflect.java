package com.answer.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/11 11 37
 */
public class Reflect {

    @Test
    public void testReflect() {
        long begin = System.currentTimeMillis();
        System.out.println(begin);
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
            System.out.println(ms[i].getReturnType() + "  - " + ms[i].getName() + "-" + ms[i].getParameterTypes());
        }

        System.out.println("========================");

        System.out.println("" + System.currentTimeMillis() + " - " + (System.currentTimeMillis() - begin));
        System.out.println((System.currentTimeMillis() - begin) / 1000);
    }

    @Test
    public void testPrintMessage() {
//        printClassMessage(new Student());
//        Student student = new Student();
//        student.setName("suchao");
//        student.setAge(27);
//        try {
//            getClassConstruct(student);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        getConstructor(new Student());
    }

    public void printClassMessage(Object object){
        Class c = object.getClass();
        System.out.println("类的名称是：" + c.getName());
        Method[] ms = c.getMethods();
        for (int i = 0; i < ms.length; i++) {
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName() + " ");
            System.out.print(ms[i].getName() + " (");
            Class[] paraTypes = ms[i].getParameterTypes();
            for (Class cls : paraTypes) {
                System.out.print(cls.getName() + ",");
            }
            System.out.print(")");
        }
    }

    /**
     * 成员变量也是对象，是java.lang.reflect.Field这个类的的对象
     * Field类封装了关于成员变量的操作
     * getFields()方法获取的是所有public的成员变量的信息
     * getDeclareFields()方法获取的是该类自己声明的成员变量的信息
     */
    public void getClassConstruct(Object object) throws IllegalAccessException {
        //要获取类的信息，首先要获取类的类类型
        //传递的是哪个子类的对象，c就是该子类的类类型
        Class c = object.getClass();
        //获取类的名称
        System.out.println("累的名称是："+c.getName());
        Field[] fs = c.getDeclaredFields();
        for (Field f : fs) {
            //设置可以访问对象中的私有成员变量
            f.setAccessible(true);
            //得到成员变量的类型
            Class fieldType = f.getType();
            String typeName = fieldType.getName();
            //得到成员变量的名称
            String fieldName = f.getName();

            System.out.println(fieldName   + "(" + typeName + ")");
        }
    }

    public void getConstructor(Object object) {
        Class c = object.getClass();

        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs){
            System.out.print(constructor.getName() + "(");
            Class[] params = constructor.getParameterTypes();
            for (Class cl : params) {
                System.out.print(cl.getName() + ",");
            }
            System.out.print(")");
        }

    }

    @Test
    public void testList() {
        ArrayList list1 = new ArrayList();
        ArrayList list3 = new ArrayList();
        List<String> list2 = new ArrayList<>();
        Class c1 = list1.getClass();
        Class c2 = list2.getClass();
        Class c3 = list3.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
