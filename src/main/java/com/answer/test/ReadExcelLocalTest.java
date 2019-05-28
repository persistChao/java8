package com.answer.test;


import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/5/15 19 14
 */
public class ReadExcelLocalTest {

    public static void main(String[] args) throws IOException, ParseException {
        List<String> orderList = new ArrayList<>();
        String fileName ="C:/Users/admin/Documents/chaping.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line =bufferedReader.readLine();
        while (line!=null){
            String[] ueva = line.split("\t");
            String[] evaluates = ueva[1].split(",");
            int a = 0;
            for (int i = 0 ; i < evaluates.length ; i++) {
                String ev = evaluates[i];
                if (ev.equals("绕路") || ev.equals("未主动联系乘客") || ev.equals("未按指定地点接送")) {
                    a++;
                }
            }
            if (a > 0) {
                orderList.add(ueva[0]);
            }
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        fileReader.close();
        orderList.forEach(s -> System.out.println(s));

    }

}
