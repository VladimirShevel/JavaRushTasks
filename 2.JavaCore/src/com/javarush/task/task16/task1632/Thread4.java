package com.javarush.task.task16.task1632;

/**
 * Created by vrarena1603 on 19.04.2017.
 */
public class Thread4 extends Thread implements Message {
          @Override
    public void showWarning() {
        interrupt();
          }
}
