package com.answer.test;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/22 22 19
 */
public class Test01 {

    public static void main(String[] args) {
        /**
         * -XX:+PrintGCDetail -XX:+UseSerialGc -XX:+PrintCommandLineFlags -Xms2m -Xms20m
         */
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
        byte[] b1 = new byte[1 * 1024 * 1024];
        System.out.println("分配了1M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
        byte[] b2 = new byte[4 * 1024 * 1024];
        System.out.println("分配了4M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());

        int a = 0x00000000fa0a0000;
        int b = 0x00000000fa801000;
        System.out.println("结果为：" + (b-a)/1024);

    }
}
