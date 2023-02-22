package Homework20;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //1) Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that
        ArrayList<String> names = new ArrayList<>();
names.isEmpty();
names.add("Alisa");
names.add("Kevin");
names.add("Elizabeth");
names.add("Mettew");
names.add("John");
        for (String x:names){


        }

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Kevin"));
        System.out.println(names.size());
        System.out.println(names);


        }

    }

