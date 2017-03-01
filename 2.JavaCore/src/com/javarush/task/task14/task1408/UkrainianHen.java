package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 23.02.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
    public  String getDescription(){
        return super.getDescription()+" Моя страна - " + UKRAINE +". Я несу "+ getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
