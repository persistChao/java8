package com.answer.lambda;

import org.junit.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 15 39
 */
public class Lambda5 {

    /**
     * Predicate 是一个布尔类型的函数
     * 该函数只有一个输入参数，用户处理复杂的逻辑动词 如 and or negate
     */
    @Test
    public void testPredicate(){
        Predicate<String> predicate = s -> s.length() > 0;
        System.out.println("判断‘s’长度是否大于0 ：" + predicate.test("s"));
        System.out.println("否定" + predicate.negate().test("foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Objects.isNull("s");
        Object s = "";
        System.out.println("null nonNUll ? :" + nonNull.test(Objects.nonNull(s)));
        System.out.println("Object s isNull? :" + isNull.test(Objects.isNull(s)));

        Predicate<Integer> predicate1 = integer -> integer > 3;
        System.out.println("4 > 3 ? " + predicate1.test(4));
    }

    /**
     * Function接口接收一个参数，并返回单一的结果。默认方法可以将多个函数串在一
     起（compse, andThen）
     */
    @Test
    public void testFunctions(){
        Function<String , Integer> toInteger = Integer::valueOf;
        Function<String , String> backToString = toInteger.andThen(String::valueOf);
        System.out.println(backToString.apply("123").getClass());
        System.out.println(toInteger.apply("123").getClass());


    }
}
