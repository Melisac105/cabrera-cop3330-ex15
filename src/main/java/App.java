/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 15 - Password Validation
Passwords are validated by comparing a user-provided value with a known value that’s stored. Either it’s correct or it’s not.

Create a simple program that validates user login credentials. The program must prompt the user for a username and password. The program should compare the password given by the user to a known password. If the password matches, the program should display “Welcome!” If it does not match, the program should display “I don’t know you.”

Example Output
What is the password? 12345
I don't know you.
Or

What is the password? abc$123
Welcome!

Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.
 */


import util.Output;
import util.Processing;
import util.UsrInput;

public class App {

    public static void main(String[] args) {
        String password = UsrInput.getPassword();
        int passwordValidation = Processing.validatePassword(password);
        Output.printOutput(passwordValidation);
    }
}
