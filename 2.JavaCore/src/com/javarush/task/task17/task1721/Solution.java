package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();


        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            while ((line = br.readLine()) != null) {
            allLines.add(line);
            }}
                for (String x : allLines)
                    System.out.println(x);

        String file2 = reader.readLine();
        try    (BufferedReader br1 = new BufferedReader(new FileReader(file2))){
            String line1;
            while ((line1 = br1.readLine()) != null) {
                forRemoveLines.add(line1);
            }}
        for (String x : forRemoveLines)
            System.out.println(x);
        Solution solution = new Solution();
                solution.joinData();

        for (String x : allLines)
            System.out.println(x);
        System.out.println("end");
    }

    public  void joinData() throws CorruptedDataException {
           if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines); else {allLines.clear(); throw new CorruptedDataException();}
    }
}
