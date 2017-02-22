package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (in.ready()){
            int number = Integer.parseInt(in.readLine());
            if (number % 2==0) list.add(number);
        }
        Collections.sort(list);
        for (Integer x : list)
            System.out.println(x);
        reader.close();
        in.close();
    }
}
