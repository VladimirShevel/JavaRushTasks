package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        //Hen hen = new BelarusianHen();
        System.out.println(hen.getDescription());
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {

            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.BELARUS)) return new BelarusianHen();
            else if (country.equals(Country.MOLDOVA)) return new MoldovanHen();
            else if (country.equals(Country.RUSSIA)) return new RussianHen();
            else if (country.equals(Country.UKRAINE)) return new UkrainianHen(); else
            return hen;
        }
    }


}
