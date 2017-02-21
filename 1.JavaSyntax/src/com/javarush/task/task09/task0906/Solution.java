package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stacktrace =  Thread.currentThread().getStackTrace();
        Solution solution = new Solution();
        System.out.println(stacktrace[2].getClassName() + ": " + stacktrace[2].getMethodName() + ": " + s);
        //напишите тут ваш код
    }
}
