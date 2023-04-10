package test;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter phone number: ");
        String s = sc.nextLine();

        String res1 = s.substring(0,3);
        String res2 = s.substring(7,11);

        System.out.println("The output number is: " + res1 + "****" + res2);
    }
}
