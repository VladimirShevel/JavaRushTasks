package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String name;
        private String adress;
        private int age;
        private boolean sex;
        private Human father;
        private Human mouther;

        public Human(){}

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String adress, int age, boolean sex, Human father) {
            this.name = name;
            this.adress = adress;
            this.age = age;
            this.sex = sex;
            this.father = father;
        }

        public Human(String name, String adress, int age, boolean sex, Human father, Human mouther) {
            this.name = name;

            this.adress = adress;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mouther = mouther;
        }

        public Human(String name, String adress) {
            this.name = name;
            this.adress = adress;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, Human father, Human mouther) {
            this.name = name;
            this.father = father;
            this.mouther = mouther;
        }

        public Human(String name, int age, Human father) {
            this.name = name;
            this.age = age;
            this.father = father;
        }

        public Human(String name, String adress, int age, boolean sex) {
            this.name = name;
            this.adress = adress;
            this.age = age;
            this.sex = sex;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
