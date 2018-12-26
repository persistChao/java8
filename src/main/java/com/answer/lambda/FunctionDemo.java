package com.answer.lambda;

import org.junit.Test;

import java.util.function.Function;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 16 28
 */
public class FunctionDemo {

    @Test
    public void test1(){
        Function<Integer , Integer> name = e -> e * 2;
        Function<Integer , Integer> square = e -> e * e;
        // andThen 先执行调用者，然后再执行参数
        int value = name.andThen(square).apply(3);
        System.out.println("andThen value :" + value);

        //compose 函数先执行参数，然后执行调用者
        int value2 = name.compose(square).apply(3);
        System.out.println("compose apply value : " + value2);
        //返回一个执行了apply()方法之后只会返回输入参数的函数对象
        Object identity = Function.identity().apply("houhou");
        System.out.println(identity);
    }
}
