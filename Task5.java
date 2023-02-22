package Homework20;

import java.util.ArrayList;
import java.util.Collection;

public class Task5 {
    public static void main(String[] args) {
        //5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <=500 ; i+=2) {
                numbers.add(i);
            }
            numbers.removeIf(i ->i%5==0);
            System.out.println(numbers);
        }
    }

