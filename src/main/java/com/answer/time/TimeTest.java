package com.answer.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



/**
 * @descreption
 * @Author answer
 * @Date 2018/12/26 10 22
 */
public class TimeTest {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDateTime nowTime = LocalDateTime.now();

        System.out.println("tody:" + today);
        System.out.println("nowTime:" + nowTime);
        System.out.println(nowTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm/ss")));
        System.out.println("==================");

        LocalDate df_date = LocalDate.of(2018,12,26);
        System.out.println("自定义时间：" + df_date);

    }


    @Test
    public void testLocalTime(){
        LocalTime time = LocalTime.now();
        System.out.println("time :" + time);
        LocalTime df_time = LocalTime.of(10,49,30);
        System.out.println("df_time :" + df_time);
    }



}
