package com.javarush.task.task15.task1525;

import sun.nio.cs.UTF_32;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        Path path = Paths.get(Statics.FILE_NAME);
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Solution() {
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
