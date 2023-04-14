package test;

/*
    Requirement: Create a collection of strings, store 3 string elements inside,
    and use the program to iterate through the collection in the console.
 */

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("minji");
        list.add("daniel");
        list.add("haeren");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
