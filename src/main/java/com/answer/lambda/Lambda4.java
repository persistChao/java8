package com.answer.lambda;

import org.junit.Test;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 15 28
 */
public class Lambda4 {

    static int outerStaticNum;

    int outerNum;

    @Test
    public void testScopes() {
        Converter<Integer , String> stringConverter = from -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        System.out.println("outerNum:" + outerNum);

        Converter<Integer , String> stringConverter1 = from -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println(stringConverter);
        System.out.println("outerStaticNum :" + outerStaticNum);

    }
}
