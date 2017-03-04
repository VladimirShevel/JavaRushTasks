package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {

    public static class Cat {
        public String name;
    }

    public static Cat cat = new Cat();

    static
    {
        cat.name = "Vaska";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
       // System.out.println(cat.name);
    }
}
