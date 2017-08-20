package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<String, Integer>(); //напишите тут ваш код
        map.put("Sel1" , 5010);
        map.put("Sel2" , 5001);
        map.put("Sel3" , 5001);
        map.put("Sel4" , 5010);
        map.put("Sel5" , 5010);
        map.put("Sel6" , 5010);
        map.put("Sel7" , 5010);
        map.put("Sel8" , 500);
        map.put("Sel9" , 200);
        map.put("Sel10" , 500);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for (Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue()<500) iterator.remove();}
    }
        //напишите тут ваш код


    public static void main(String[] args) {
        HashMap<String,Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String,Integer> entry : map.entrySet());
          //  System.out.println(entry.getKey() + " "+ entry.getValue());

    }
}