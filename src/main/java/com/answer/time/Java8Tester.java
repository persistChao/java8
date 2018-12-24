package com.answer.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by chao on 2018/12/24.
 */
public class Java8Tester {
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();
        tester.testLocalDateTime();
        tester.testTime();
    }

    public void testLocalDateTime(){
        //获取当前日期
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间 :" + currentTime);
        System.out.println("格式化时间 :" + currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) );
        System.out.println("ISO_Date :" + currentTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("格式化2 :" + currentTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("格式化3 :" + currentTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("格式化4 :" + currentTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("格式化5 :" + currentTime.format(DateTimeFormatter.ISO_TIME));

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:" + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月:" + month + " 日：" + day + " 秒:" + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(24).withYear(2018);
        System.out.println(date2);

        LocalDate date3 = LocalDate.of(2018,Month.DECEMBER , 24);
        System.out.println("date3:" + date3);

        LocalTime date5 = LocalTime.parse("22:59:24");
        System.out.println("date5:" + date5);

    }

    public void testTime(){
        System.out.println("===============================");
        Clock clock = Clock.systemDefaultZone();
        System.out.println("clock :" + clock);

        LocalTime time = LocalTime.now();
        System.out.println("time  :" + time);

        LocalTime specifcTime = LocalTime.of(12,20,25,40);
        System.out.println("specifcTime :" + specifcTime);


    }
}
