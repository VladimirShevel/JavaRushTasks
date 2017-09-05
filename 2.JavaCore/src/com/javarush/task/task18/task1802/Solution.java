package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream reader = new FileInputStream(sc.nextLine());
        if (reader.read()>0) {int bite=reader.read();
        int bute;
        while (reader.available()>0) {
            bute = reader.read();
            if (bite > bute) bite = bute;
        }
        reader.close();
        System.out.println(bite);}
        else reader.close();
    }
}