package com.javarush.task.task15.task1522;

/**
 * Created by vrarena1603 on 08.03.2017.
 */
public class Sun implements Planet {
    private Sun sun;
    public Sun getSun() {
        if (sun == null) return new Sun();
        return sun;
    }


}
