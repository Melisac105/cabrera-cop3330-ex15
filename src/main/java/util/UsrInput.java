package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String getPassword() {
        System.out.print("What is the password? ");
        return input.nextLine();
    }
}
