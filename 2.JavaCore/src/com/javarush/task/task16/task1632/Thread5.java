package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vrarena1603 on 19.04.2017.
 */
public class Thread5 implements Runnable {
    @Override
    public void run() {
        int summ=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String s = reader.readLine();
                if (s.equals("N")) break;
                else summ += Integer.parseInt(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(summ);
    }
}
