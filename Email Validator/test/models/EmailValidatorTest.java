package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    @Test
    public void checkEmailAddressStartsWithAWhiteSpaceTest(){
        String emailAddress = " adamson@gmail.com";
        boolean result = Validator.emailValidator(emailAddress);
        assertFalse(result);
    }

    @Test
    public void checkEmailAddressWithAtSignTest(){
        String emailAddress = "o.oladeji@semicolon.africa";
        boolean result = Validator.emailValidator(emailAddress);
        assertTrue(result);
    }

}