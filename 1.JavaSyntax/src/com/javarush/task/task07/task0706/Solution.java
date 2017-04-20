package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < 15 ; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        if (i%2==0) evenCounter+= array[i]; else oddCounter+=array[i];
        }
        sc.close();
        if (oddCounter>evenCounter) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");

        //напишите тут ваш код
    }
}
