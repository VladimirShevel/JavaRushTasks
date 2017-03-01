package com.javarush.task.task13.task1319;



import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // напишите тут ваш код
        String name = reader.readLine();
        BufferedWriter out = new BufferedWriter(new FileWriter(name));
    while (true){
        String string = reader.readLine();
        out.write(string+"\n");
        if (string.equals("exit")) break;
    }
    out.close();
    }

}
