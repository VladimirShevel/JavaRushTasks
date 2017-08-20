package com.javarush.task.task07.task0712;

//import sun.plugin.javascript.navig.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> list = new ArrayList<>();
       Scanner sc= new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String s = sc.nextLine();
            list.add(s);
         }
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (String str: list) {
            if (str.length() < minLength){
                minLength = str.length();
                minIndex = list.indexOf(str);
            }
            if (str.length() > maxLength){
                maxLength = str.length();
                maxIndex = list.indexOf(str);
            }
        }
        System.out.println(list.get(Math.min(minIndex, maxIndex)));
    }
}
