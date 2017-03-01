package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 23.02.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }
    @Override
    public  String getDescription(){
        return super.getDescription()+" Моя страна - " + MOLDOVA +". Я несу "+ getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
