package util;

public class Processing {
    static String correctPassword = "abc$123";

    static public int validatePassword(String password) {
        int validate = password.compareTo(correctPassword);
//        if (validatePassword.equals(true)){
//
//        }
        return validate;
    }
}
