package com.javarush.task.task14.task1417;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}