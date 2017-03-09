package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String name;
    int number;

    Solution(String name) {
        this.name = name;
    }

    protected Solution(int number) {
        this.number = number;
    }

    private Solution(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Solution() {
    }

    public static void main(String[] args) {

    }
}

