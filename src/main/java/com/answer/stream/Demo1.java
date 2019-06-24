package com.answer.stream;

import com.answer.lambda.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        List<String> list = Arrays.asList("1" , "2" ,"3");
        Arrays.asList("a1" , "a2" ,"a3").stream().findFirst().ifPresent(System.out::println);
        Stream.of("a1" , "a2", "a3").findFirst().ifPresent(System.out::println);
        Stream.of(list).findFirst().ifPresent(System.out::println);
    }

    @Test
    public void testIntStream() {
        IntStream.range(1,5).forEach(System.out::println);
        List<Integer> list = Arrays.asList(1, 10, 5, 4, 6, 7);
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        System.out.println("=============================");
        Arrays.stream(new int[]{1, 3, 5}).map(n -> 2 * n + 1).average().ifPresent(System.out::println);
    }

    @Test
    public void test3() {
        Stream.of("a1" ,"a2" ,"a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        IntStream.range(1 ,4).mapToObj(i -> "a" + i).forEach(System.out::println);
    }

    @Test
    public void testCompositionStream() {
        Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i-> "a" + i).forEach(System.out::println);
    }

    @Test
    public void testStreamObject(){
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("1" ,"2"));
        list1.add(new Person("3", "4"));
        list1.add(new Person("5", "6"));
        list1.add(new Person("5", "2"));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("1" ,"2"));
        list2.add(new Person("6", "4"));
        list2.add(new Person("3", "6"));
        list2.add(new Person("5", "2"));

        list1.stream().filter(p -> p.getFirstName().equals("5")).forEach(System.out::println);
        list1.stream().filter(p -> p.getLastName().equals("2")).forEach(System.out::println);

        System.out.println("===========================");
        List<Person> personList = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        personList.forEach(System.out::println);


        Person person = new Person("1" ,"2");
        for (Person l : list2){
            if (list2.contains(person)){
                System.out.println(l);
            }
        }


    }

    @Test
    public void test8() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setFirstName("su" + i);
            person.setLastName("chao" + i );
            personList.add(person);
        }

        List<String> list = new ArrayList<>();
        list.add("su2");
        list.add("chao3");

        personList = personList.stream().filter(item -> !list.contains(item.getFirstName())).collect(Collectors.toList());
        for (Person p: personList ) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
