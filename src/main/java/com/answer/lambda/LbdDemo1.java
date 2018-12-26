package com.answer.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 10 53
 */
public class LbdDemo1 {
    @Test
    public void test1(){
        List<String> names = Arrays.asList("peter" ,"anna","mike","lilei","lili" ,"xenia");

        names.forEach(n -> System.out.println(n));

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names , (String a , String b) ->{
//            return b.compareTo(a);
//        });

//        Collections.sort(names , (String a , String b) -> b.compareTo(a));

        Collections.sort(names , (a , b)-> b.compareTo(a));
        System.out.println("========================");
        names.forEach(n -> System.out.println(n));

    }
}
