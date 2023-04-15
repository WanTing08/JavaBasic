package main.java.test;

import main.java.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //增删改查都是围绕着这个list进行操作
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-----------Welcome-----------");
            System.out.println("1.Add student information");
            System.out.println("2.Delete student information");
            System.out.println("3.Update student information");
            System.out.println("4.View student information");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudentInfo(list);
                    break;
                case 2:
                    deleteStudentById(list);
                    break;
                case 3:
                    updateStudentById(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("The input is wrong, try again.");
                    break;
            }
        }
    }

    private static void addStudentInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the student id:");

        String id = "";
        while(true){
            id = sc.next();

            int index = getIndex(id,list);
            if(index == -1){
                break;
            }else{
                System.out.println("input is wrong, please try again");
            }
        }
        System.out.println("Please enter the student name:");
        String name = sc.next();
        System.out.println("Please enter the student age:");
        int age = sc.nextInt();
        System.out.println("Please enter the student birthday:");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);
        list.add(stu);
        System.out.println("add successfully");
    }

    private static void updateStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id of the student information to be updated:");
        String updateId = sc.next();
        int index = getIndex(updateId, list);
        if(index == -1){
            System.out.println("cannot find the student");
        }else{
            System.out.println("Please enter a new student name:");
            String name = sc.next();
            System.out.println("Please enter a new student age:");
            int age = sc.nextInt();
            System.out.println("Please enter a new student birthday:");
            String birthday = sc.next();

            //将新录入的学生信息，封装为学生对象
            Student stu = new Student(updateId, name, age, birthday);
            list.set(index, stu);
            System.out.println("update successfully");
        }

    }

    //delete student information by ID
    private static void deleteStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id of the student information to be deleted:  ");
        String id = sc.next();
        int index = getIndex(id, list);
        if(index == -1){
            System.out.println("cannot find the student");
        }else{
            list.remove(index);
            System.out.println("delete successfully");
        }
    }

    // view student information
    private static void queryStudentInfos(ArrayList<Student> list) {
        if(list.size() == 0){
            System.out.println("cannot find");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "---" + stu.getName() + "---" + stu.getAge() + "---" + stu.getBirthday());
            }

        }
    }

    //Find the corresponding index in the collection according to the student ID
    private static int getIndex(String id, ArrayList<Student> list){
        for(int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
