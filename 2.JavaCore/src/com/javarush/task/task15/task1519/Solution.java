package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напиште тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;
            list.add(s);
        }
        for (String x : list){
           if (x.contains("."))
               try
               {
                   print(Double.parseDouble(x));
               }
                 catch (NumberFormatException e)
                 {
                     print(x);
                 } else
           try {int a = Integer.parseInt(x);
               if (a > 0 && a < 128) print((short) a); else print(a); }
           catch (NumberFormatException e) {
               print(x);
           }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
