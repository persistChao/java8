package com.answer.lambda.list;

import org.junit.Test;

import java.util.ArrayList;
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
        List<Integer> list = Stream.of(asList(1, 2), asList(3, 4)).flatMap(n -> n.stream()).collect(toList());
        list.forEach(System.out::println);

    }


    public List<Integer> asList(Integer... arg) {
        return Arrays.asList(arg);
    }

    @Test
    public void testMaxAndMin() {
        List<User> userList = Stream.of(new User(12, "zhangsan"), new User(13, "lisi"), new User(32, "wangwu")).collect(toList());
        User user = userList.stream().min(Comparator.comparing(u -> u.getAge())).get();
        System.out.println(user);
        User user1 = userList.stream().max(Comparator.comparing(User::getAge)).get();
        System.out.println(user1);
    }

    /**
     * 可以从一个list中获取一个值
     */
    @Test
    public void testReduce() {
        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println(count);
    }

    /**
     * 将一个对象list转换为另一个对象list
     */
    @Test
    public void testStreamMap() {
        List<User> userList = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            User user = new User();
            user.setAge(i);
            user.setName("name-" + i);
            userList.add(user);
        }

        userList.forEach(System.out::println);
        System.out.println("------------------------------------");
        List<User1> list1 = userList.stream().map(e -> new User1(e.getName(), e.getAge())).collect(toList());
        list1.forEach(System.out::println);
    }

    @Test
    public void testStreamFilter() {
        List<String> list = Stream.of("1", "3", "3", "54").collect(toList());

        list = list.stream().filter(a -> a.contains("3")).collect(toList());
        list.forEach(System.out::println);
    }

    public boolean compareS (String a , int b) {
        if (a.equals(String.valueOf(b))) {
            return true;
        }
        return false;
    }
}
