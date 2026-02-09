package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {
    @Test
    public void checkNigeriaPhoneNumberThatBeginsWith070(){
        String phoneNumber = "07044444444";
        boolean result = PhoneNumberValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(result);
    }

    @Test
    public void checkNigeriaPhoneNumberThatBeginsWith080(){
        String phoneNumber = "08044444444";
        boolean result = PhoneNumberValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(result);
    }

    @Test
    public void checkChadPhoneNumberThatBeginsWithPlus235(){
        String phoneNumber = "+23588776655";
        boolean result = PhoneNumberValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(result);
    }

    @Test
    public void checkNigeriaPhoneNumberThatBeginsWithPlus234(){
        String phoneNumber = "+23444444444";
        boolean result = PhoneNumberValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(result);
    }

}