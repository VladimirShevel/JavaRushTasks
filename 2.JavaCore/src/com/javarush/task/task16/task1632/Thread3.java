package com.javarush.task.task16.task1632;

/**
 * Created by vrarena1603 on 19.04.2017.
 */
public class Thread3 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
