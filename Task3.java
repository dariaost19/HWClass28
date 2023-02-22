package Homework20;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //3)Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String>words=new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Orange");
        words.add("Mango");
        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }
}
