package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;
    public static int B = 5;
    static {
        try {
           B = B / A ;}
        catch (RuntimeException e) {
            throw new RuntimeException();
        } //throw an exception here - выбросьте э
    }

    public static void main(String[] args) {
        System.out.println(B);
    }
}
