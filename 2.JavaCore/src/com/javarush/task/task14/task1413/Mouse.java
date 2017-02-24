package com.javarush.task.task14.task1413;

/**
 * Created by vrarena1603 on 24.02.2017.
 */
public class Mouse implements CompItem {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
