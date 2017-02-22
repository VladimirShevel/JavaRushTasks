package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       // File file = new File("MyFile.txt");
       // file.createNewFile();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream reader1 = new FileInputStream(name);
        while (reader1.available()!=0) {

            System.out.print((char) reader1.read());
        }
        System.out.println();
    reader.close();
        reader1.close();
        // напишите тут ваш код
    }
}