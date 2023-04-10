package test;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

/*
Enter a string and count the number of occurrences of uppercase alphabetic characters, lowercase alphabetic characters
and numeric characters in that string.
 */
public class StringTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter: ");
        String s = sc.nextLine();

        int lowerCount = 0, upperCount = 0, numericCount = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') lowerCount++;
            if (c[i] >= 'A' && c[i] <= 'Z') upperCount++;
            if (c[i] >= '0' && c[i] <= '9') numericCount++;
        }
        System.out.println("the count of lowercase character: " + lowerCount);
        System.out.println("the count of uppercase character: " + upperCount);
        System.out.println("the count of numeric character: " + numericCount);
    }

}
