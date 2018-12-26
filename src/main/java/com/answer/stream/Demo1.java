package com.answer.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 17 09
 */
public class Demo1 {

    @Test
    public void test1() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c1", "c2", "c5");
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }

    @Test
    public void test2() {

    }
}
