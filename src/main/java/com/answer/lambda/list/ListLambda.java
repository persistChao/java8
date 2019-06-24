package com.answer.lambda.list;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @descreption
 * @Author answer
 * @Date 2019/6/24 10 26
 */
public class ListLambda {

    @Test
    public void test1() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        collected.forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        collected = collected.stream().map(s -> s + "sssdds").collect(Collectors.toList());
        collected.forEach(System.out::println);

        collected = collected.stream().filter(s -> !s.contains("a")).collect(Collectors.toList());
        System.out.println("=======================");
        collected.forEach(System.out::println);
    }


}
