package com.answer.lambda;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 11 32
 */
@FunctionalInterface
public interface Converter<F , T> {
   T convert(F from);

//    Converter<String , Integer> convert = (from) -> Integer.valueOf(from);
//    Integer converted = convert.convert();

}
