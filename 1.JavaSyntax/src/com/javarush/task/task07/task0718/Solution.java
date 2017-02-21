package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //напишите тут ваш код
      ArrayList<String> list = new ArrayList<String>();
      for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
            String s = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length()<s.length()) {System.out.println(i);break;}
            s = list.get(i);
        }
    }
}

