package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 23.02.2017.
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 22;
    }
    @Override
    public  String getDescription(){
        return super.getDescription()+" Моя страна - " + RUSSIA +". Я несу "+ getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
