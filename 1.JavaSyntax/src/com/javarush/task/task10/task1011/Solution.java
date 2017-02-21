package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] str = s.toCharArray();
        List<Character > list = new ArrayList<Character>();
        for (int i = 0; i <str.length ; i++) {
            list.add(str[i]);
        }
        for (int i = 0; i < 40; i++) {
              for (Character x : list)
                  System.out.print(x);
              System.out.println();
              list.remove(0);
        }
    }
}

