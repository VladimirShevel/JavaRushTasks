package com.javarush.task.task16.task1632;

/**
 * Created by vrarena1603 on 19.04.2017.
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                if (Thread.currentThread().isInterrupted())
                    throw new InterruptedException();
            } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            break;
        }
    }}
}
