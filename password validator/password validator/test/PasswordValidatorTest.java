import exceptions.PasswordException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
    public void checkIfPasswordValidatorCatchesBlankPasswordTest(){
        String myPassword = "";
        assertThrows(PasswordException.class, ()-> PasswordValidator.validatePassword(myPassword));
    }

    @Test
    public void checkIfPasswordDoesNotContainsAnyOfSpecialCharactersTest(){
        String myPassword = "password";
        assertThrows(PasswordException.class, ()-> PasswordValidator.validatePassword(myPassword));
    }

    @Test
    public void checkIfPasswordContainsAtLeastOneOfSpecialCharactersTest(){
        String myPassword = "p*assword7";
        String response = PasswordValidator.validatePassword(myPassword);
        assertEquals("correct, all requirement met", response);
    }

    @Test
    public void checkIfPasswordIsLessThanEightCharactersTest(){
        String myPassword = "p*asrd7";
        assertThrows(PasswordException.class, ()-> PasswordValidator.validatePassword(myPassword));
    }

    @Test
    public void checkIfPasswordIsMoreThanEightCharactersTest(){
        String myPassword = "p*assWORD7";
        String response = PasswordValidator.validatePassword(myPassword);
        assertEquals("correct, all requirement met", response);
    }



}