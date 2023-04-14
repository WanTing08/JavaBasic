package test;


import domain.Student;

import java.util.ArrayList;

public class ArrayListTest4 {
    /*
        Screening information for students under 18 years old
     */
    public static void main(String[] args) {
        ArrayList<domain.Student> list = new ArrayList<>();

        list.add(new Student("wwt", 25));
        list.add(new Student("jinni", 17));

        ArrayList<Student> newList = filter(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }

    }

    private static ArrayList<Student> filter(ArrayList<Student> list){
        ArrayList<Student> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getAge() < 18){
                newList.add(stu);
            }
        }
        return newList;
    }
}
