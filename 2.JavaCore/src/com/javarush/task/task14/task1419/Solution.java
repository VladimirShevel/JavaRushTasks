package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    static class Exception1 extends Exception {
        String error = "errora1";

        public Exception1() {}
    }
    static class Exception2 extends Exception {String error = "errora2";}
    static class Exception3 extends Exception {String error = "errora3";}
    static class Exception4 extends Exception {String error = "errora4";}
    static class Exception5 extends Exception {String error = "errora5";}
    static class Exception6 extends Exception {String error = "errora6";}
    static class Exception7 extends Exception {String error = "errora7";}
    static class Exception8 extends Exception {String error = "errora8";}
    static class Exception9 extends Exception {String error = "errora9";}




    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        int a = -45;
        try {
            float i = 1 / 0;
        }
        catch (ArithmeticException e){
            exceptions.add(e);
        }

        try {if (a<0)
            throw new Exception1();
        }
        catch (Exception1 e) {
           exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception2();
        }
        catch (Exception2 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception3();
        }
        catch (Exception3 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception4();
        }
        catch (Exception4 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception5();
        }
        catch (Exception5 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception6();
        }
        catch (Exception6 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception7();
        }
        catch (Exception7 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception8();
        }
        catch (Exception8 e) {
            exceptions.add(e);
        }
        try {if (a<0)
            throw new Exception9();
        }
        catch (Exception9 e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
    }
}
