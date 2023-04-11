package test;

import java.util.Scanner;

/*
    Requirement: Keyboard in a string, the program determines whether the string is a symmetric string and prints yes or no on the console.
    Example: 123321, 111
 */
public class StringBuilderTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        if(s.equals(sb.toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
