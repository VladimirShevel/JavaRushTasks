package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 23.02.2017.
 */
public class BelarusianHen extends Hen {
    public BelarusianHen() {
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }
    @Override
    public String getDescription(){
       return super.getDescription()+" Моя страна - " + BELARUS +". Я несу "+ getCountOfEggsPerMonth()+ " яиц в месяц.";
    }

}
