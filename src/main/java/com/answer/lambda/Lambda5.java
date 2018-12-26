package com.answer.lambda;

import org.junit.Test;

import java.util.Objects;
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
}
