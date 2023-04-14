package test;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTest2 {

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the student name: ");
        String name = sc.next();
        System.out.println("Please enter the student age: ");
        int age = sc.nextInt();

        Student stu = new Student(name, age);

        list.add(stu);
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            System.out.println("Please enter the " + i +"-th student information");
            addStudent(list);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }
    }
}
