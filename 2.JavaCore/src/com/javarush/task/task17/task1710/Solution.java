package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]){
            case "-c" : synchronized (allPeople) {addPerson(args);}
                break;
            case "-u" : synchronized (allPeople) {refreshPersonByID(args);}
                break;
            case "-d" : synchronized (allPeople) {delByID(args);}
                break;
            case "-i" : synchronized (allPeople) {print(args);}
        }
    }
    public static void addPerson(String[] arg) throws ParseException {
        for (int i = 1; i < arg.length - 1;) {
            String name = arg[i];
            i++;
            String sex = arg[i];
            i++;
            Date db = new SimpleDateFormat("dd/MM/yyyy").parse(arg[i]);
            i++;
            if (sex.equals("м")) allPeople.add(Person.createMale(name , db)); else allPeople.add(Person.createFemale(name , db));
            System.out.println(allPeople.size() - 1);
        }
    }
    public static void refreshPersonByID(String[] arg) throws ParseException {
        for (int i = 1; i < arg.length; i+=4) {
            Person person = allPeople.get(Integer.parseInt(arg[i]));
            person.setName(arg[i+1]);
            if (arg[i+2].equals("ж")) person.setSex(Sex.FEMALE); else person.setSex(Sex.MALE);
            person.setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(arg[i+3]));
            allPeople.set(Integer.parseInt(arg[i]),person);
        }
    }

    public static void delByID(String[] arg){
        for (int i = 1; i < arg.length; i++) {
            allPeople.get(Integer.parseInt(arg[i])).setName(null);
            allPeople.get(Integer.parseInt(arg[i])).setSex(null);
            allPeople.get(Integer.parseInt(arg[i])).setBirthDay(null);
        }
    }
    public static void print(String[] arg){
        for (int i = 1; i < arg.length; i++) {
            System.out.println(allPeople.get(Integer.parseInt(arg[i])));
        }
    }
}