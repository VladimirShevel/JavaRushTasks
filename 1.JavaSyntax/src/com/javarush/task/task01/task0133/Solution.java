package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        return seconds % 3600;
//        if (seconds<3600) return 0; else {
//        while (true){
//            if (seconds>3600) seconds -=3600; else break;}}
//        int rezult = seconds;
//        return rezult;
        }

//        int hours = 12345/3600; //напишите тут ваш код
//        return seconds - hours*3600;

}