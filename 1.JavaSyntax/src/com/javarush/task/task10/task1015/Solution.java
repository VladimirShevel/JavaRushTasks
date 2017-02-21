package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("asdg sdfgh");
        list1.add("asdg sdfg");
        list1.add("wer  yj fgh fgh n");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(list1);
        ArrayList<String>[] arrayOfStringList = new ArrayList[]{list1, list2};
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}