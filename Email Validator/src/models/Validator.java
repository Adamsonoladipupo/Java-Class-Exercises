package models;

public class Validator {
    public static boolean emailValidator(String emailAddress){
        String pattern = "\\S[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return emailAddress.matches(pattern);
    }

    public static boolean usernameValidator(String username){
        String pattern = "";
        return username.matches(pattern);
    }

    public static boolean phoneNumberValidator(String phoneNumber){
        String pattern = "";
        return phoneNumber.matches(pattern);
    }
}
