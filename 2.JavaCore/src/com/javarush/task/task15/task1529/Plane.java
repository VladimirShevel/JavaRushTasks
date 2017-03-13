package com.javarush.task.task15.task1529;

/**
 * Created by User on 13.03.2017.
 */
public class Plane implements Flyable {
    public int flightCounter;

    public Plane(int flightCounter) {
        this.flightCounter = flightCounter;
    }

    @Override
    public void fly() {

    }
}
