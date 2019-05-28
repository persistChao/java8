package com.answer.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @descreption
 * @Author answer
 * @Date 2019/5/28 10 18
 */
public class CommonStream {

    @Test
    public void t1() {
        List<String> collected = Stream.of("a","b","c","d").collect(Collectors.toList());
        List<String> list = collected.stream().filter(s -> s.equals("c")).collect(Collectors.toList());
        list.forEach(System.out::println);
        collected.forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<String> collected = Stream.of("a", "b", "hello").map(string -> string.toUpperCase()).collect(Collectors.toList());
//        collected.forEach(System.out::println);
        collected = collected.stream().map(s -> s + " " + "now").collect(Collectors.toList());
        collected.forEach(System.out::println);
    }
}
