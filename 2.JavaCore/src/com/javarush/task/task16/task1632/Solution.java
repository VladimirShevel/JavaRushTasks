package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));

        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));

    }

    public static void main(String[] args) {
    }
}