package com.javarush.task.task12.task1207;

/* 
print(int) и print(Integer)
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(45);
        print((Integer) 45);

    }
public static void print(int a){
    System.out.println("int " + a);
}
protected static void print(Integer a){
    System.out.println("Integer " + a);
}
    //Напишите тут ваши методы
}
