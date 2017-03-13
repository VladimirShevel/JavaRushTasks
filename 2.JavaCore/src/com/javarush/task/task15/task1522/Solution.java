package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(thePlanet);
    }

    public static Planet thePlanet;
static {

    try {
        readKeyFromConsoleAndInitPlanet();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
            switch (s){
                case Planet.SUN : thePlanet = Sun.getInstance();
                    break;
                case Planet.EARTH : thePlanet = Earth.getInstance();
                    break;
                case Planet.MOON : thePlanet = Moon.getInstance();
                    break;
                default : thePlanet = null;
        }

        // implement step #5 here - реализуйте задание №5 тут
    }
}
