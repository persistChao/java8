package com.answer.lambda;

/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 11 59
 */
public class Somthing {

    public String startsWith(String s){
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args){
        Somthing somthing = new Somthing();
        Converter<String , String> converter = somthing::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);


        final int num = 1;

        Converter<Integer , String> stringConverter = (from)-> String.valueOf(from + num);

        System.out.println(stringConverter.convert(2));


        int num1 = 1;
        Converter<Integer, String> integerConverter = from -> String.valueOf(from + num1);
        System.out.println(integerConverter.convert(2));

        Converter<Integer , String> stringConverter1 = from -> String.valueOf(from + num1);
//        num1 = 3;


    }
}
