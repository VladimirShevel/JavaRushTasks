package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));

    int c = 546 % 10;
    int b = (546 % 100 - c)/10; //напишите тут ваш код
    int a = (546 - c - b * 10)/100;
        System.out.println( a+b+c);}

    public static int sumDigitsInNumber(int number) {
        int c = number % 10;
        int b = (number % 100 - c)/10; //напишите тут ваш код
        int a = (number - b * 10 - c )/100;
        return  a+b+c;
    }
}