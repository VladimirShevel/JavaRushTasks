package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;


    static {

    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if s.equals("sun") thePlantet = new Sun();

        // implement step #5 here - реализуйте задание №5 тут
    }
}
