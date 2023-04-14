package test;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("wwt");
        list.add("test");
        list.add("test");
        list.add("lucy");
        list.add("eric");
        list.add("test");

        for (int i = list.size() -1; i >= 0; i--) {
            String s = list.get(i);
            if("test".equals(s)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
