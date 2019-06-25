package com.answer.lambda.list;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @descreption
 * @Author answer
 * @Date 2019/6/24 10 26
 */
public class ListLambda {

    @Test
    public void test1() {
        List<String> collected = Stream.of("a", "b", "c").collect(toList());
        collected.forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<String> collected = Stream.of("a", "b", "c").collect(toList());
        collected = collected.stream().map(s -> s + "sssdds").collect(toList());
        collected.forEach(System.out::println);

        collected = collected.stream().filter(s -> !s.contains("a")).collect(toList());
        System.out.println("=======================");
        collected.forEach(System.out::println);
    }


    @Test
    public void testFlatMap() {
    List<Integer> list = Stream.of(asList(1,2) ,asList(3,4)).flatMap(n->n.stream()).collect(toList());
    list.forEach(System.out::println);
    }


    public List<Integer> asList(Integer ...arg) {
        return Arrays.asList(arg);
    }

    @Test
    public void testMaxAndMin() {
        List<User> userList = Stream.of(new User(12,"zhangsan") , new User(13,"lisi") ,new User(32,"wangwu")).collect(toList());
        User user = userList.stream().min(Comparator.comparing(u -> u.getAge())).get();
        System.out.println(user);
        User user1 = userList.stream().max(Comparator.comparing(User::getAge)).get();
        System.out.println(user1);
    }

    @Test
    public void testReduce() {
        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println(count);
    }
}
