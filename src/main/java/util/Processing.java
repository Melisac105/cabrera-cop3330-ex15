package util;

public class Processing {
    static String correctPassword = "abc$123";

    static public int validatePassword(String password) {
        return password.compareTo(correctPassword);
    }
}
