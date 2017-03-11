package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       String s="";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) )
        {s = reader.readLine();}
        s="http://javarush.ru/alpha/index.html?obj=314&obj=trewttr.rtr&obj=erthve&name=Amigo";


        if (null != s && !"".equals(s))
            requestParcer(s);

       // public void requestParcer(String s) {}



        //add your code here
    }
    public static void requestParcer(String s) {
        String substring = s.substring(s.indexOf('?')+1);
        String[] request = substring.split("&");
        //String[] request1
        String rezultString = "";

        for (String x : request) {
            String[] rezult = x.split("=");
            rezultString += rezult[0] + " ";
        }
        System.out.println(rezultString.substring(0,rezultString.length()-1));

        for (String x : request){
                String[] rezult = x.split("=");
            if (rezult[0].equals("obj"))

                try { double a = Double.parseDouble(rezult[1]);
                        alert(a);
                    } catch (NumberFormatException e) {
                        alert(rezult[1]);
                    }
                catch (ArrayIndexOutOfBoundsException e){}

        }

    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
