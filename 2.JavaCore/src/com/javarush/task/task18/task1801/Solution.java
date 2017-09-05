package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream reader = new FileInputStream(sc.nextLine());
        int bite=0;
        int bute;
        while (reader.available()>0) {
            bute = reader.read();
            if (bite < bute) bite = bute;
        }
        reader.close();
        System.out.println(bite);
    }
}
