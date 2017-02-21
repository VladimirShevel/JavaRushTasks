package com.javarush.task.task12.task1204;

/* 
Или «Кошка», или «Собака», или «Птица», или «Лампа»
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        System.out.println(o);
    }

    public static class Cat {
        public String toString(){
            return "Кошка";
        }
    }

    public static class Dog {
        public String toString(){
            return "Собака";
        }
    }

    public static class Bird {
        public String toString(){
        return "Птица";
    }
    }

    public static class Lamp {
        public String toString(){
            return "Лампа";
        }
    }
}
