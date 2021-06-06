package util;

public class Output {

    static public void printOutput(int validation) {
        if (validation < 0) {
            System.out.print("I don't know you.");
        }
        else if (validation == 0) {
            System.out.print("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}
