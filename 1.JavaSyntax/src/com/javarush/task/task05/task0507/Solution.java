package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        boolean f = true;
        int summ = 0, count = 0;
        int number;
        while (true){
            number = scanner.nextInt();
            if (number == -1) break; else {summ += number; count++;}
        }
        System.out.println((double) summ/count);
        //напишите тут ваш код
    }
}

