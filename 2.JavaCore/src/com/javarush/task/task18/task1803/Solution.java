package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> map = new HashMap<>();
              while (stream.available()>0) {
                  int key = stream.read();
                  if (map.containsKey(key)) map.put(key, map.get(key)+1); else map.put(key, 1);
        }
       stream.close();
        if (map.size() <= 0) {
            return;
        }

        int max = Collections.max(map.values());

        for (Map.Entry<Integer,Integer> pair : map.entrySet())
            if (pair.getValue().equals(max)) System.out.print(pair.getKey()+" ");

        reader.close();
        //stream.close();
    }

}
