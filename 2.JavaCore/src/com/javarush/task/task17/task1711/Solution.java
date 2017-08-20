package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {

    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //String key= "";
       switch (args[0]){
           case "-c" : addPerson(args);
           break;
//           case "-u" : refreshPersonByID(args);
//           break;
//           case





        }
    }
   // public static void createPerson(String[])






    public static void addPerson(String[] arg) throws ParseException {
        for (int i = 1; i < arg.length - 1;) {
            String name = arg[i];
            i++;
            String sex = arg[i];
            i++;
            Date db = new SimpleDateFormat("dd/MM/yyyy").parse(arg[i]);
            i++;
            synchronized (allPeople){
            if (sex.equals("м")) allPeople.add(Person.createMale(name , db)); else allPeople.add(Person.createFemale(name , db));
                System.out.println(allPeople.size() - 1);}
        }
    }
    public static void refreshPersonByID(String[] arg) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(arg[1]));
        for (int i = 2; i < arg.length - 1;) {

            String name = arg[i];
            i++;
            String sex = arg[i];
            i++;
            Date db = new SimpleDateFormat("dd/MM/yyyy").parse(arg[i]);
            i++;

            synchronized (allPeople) {
                Person person = new Person();
                allPeople.set(arg[1], if (sex.equals("м")) Person person = (Person.createMale(name , db)); else allPeople.add(Person.createFemale(name , db));)
            }  }
        }
    }
}
