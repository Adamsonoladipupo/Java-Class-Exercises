package models;

public class PhoneNumberValidator {
    public static boolean isPhoneNumberValid(String phoneNumber){
        String pattern = "(070\\d{8})|(080[0-9]{8})|(\\+235-*\\d{8})|(\\+234\\d{8})";
        return phoneNumber.matches(pattern);
    }
}
