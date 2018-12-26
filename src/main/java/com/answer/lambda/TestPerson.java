package com.answer.lambda;

import org.junit.Test;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 15 05
 */
public class TestPerson {
    final int num = 1;

    @Test
    public void testPerson(){
        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("Peter" , "Parker");
        System.out.println(person.toString());
    }
}
