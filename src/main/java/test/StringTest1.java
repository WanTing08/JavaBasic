package test;

import java.util.Scanner;

public class StringTest1 {
    /*
        requirement: simulate user login, three chances in total, and give corresponding prompt after login

        analysis:
                  1. Define two string type variables, simulate the existed user name and password

                  2. Enter the username and password entered by user

                  3. compare them
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.Define two string type variables, simulate the existed username and password
        String username = "admin";
        String password = "123456";


        for (int i = 1; i <= 3; i++) {
            // 2. Enter the username and password entered by user
            System.out.println("Please enter the username: ");
            String inputUsername = sc.nextLine();

            System.out.println("Please enter password: ");
            String inputPassword = sc.nextLine();

            // 3. compare
            if(inputUsername.equals(username) && inputPassword.equals(password)){
                System.out.println("successfully login");
                break;
            }else{
                System.out.println("failed login, remain " + (3 - i) + " chance");
            }
        }
    }
}
