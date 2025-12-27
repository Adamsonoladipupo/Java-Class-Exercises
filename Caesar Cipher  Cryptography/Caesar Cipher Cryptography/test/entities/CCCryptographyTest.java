package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CCCryptographyTest {

    @Test
    public void convertStringToIntegertest(){
        CCCryptography ccCryptography = new CCCryptography();
        int result = ccCryptography.charToInt('w');
        assertEquals(22, result);
    }

    @Test
    public void convertIntegerToStringTest(){
        CCCryptography ccCryptography = new CCCryptography();
        char result = ccCryptography.intToChar(4);
        assertEquals('e', result);
    }

    @Test
    public void getTheModulo26OfNumberBetween0To25Test(){
        CCCryptography ccCryptography = new CCCryptography();
        int result = ccCryptography.modulo26(33);
        assertEquals(7, result);
    }

    @Test
    public void getTheModulo26OfNumberBetweenNegativeNumbersTest(){
        CCCryptography ccCryptography = new CCCryptography();
        int result = ccCryptography.modulo26(-10);
        assertEquals(16, result);
    }

    @Test
    public void AddAnInputAndAKeyTogetherTest(){
        CCCryptography ccCryptography = new CCCryptography();
        int result = ccCryptography.addKey(23, 3);
        assertEquals(26, result);
    }

    @Test
    public void MinusAnInputAndAKeyTogetherTest(){
        CCCryptography ccCryptography = new CCCryptography();
        int result = ccCryptography.minuseKey(23, 3);
        assertEquals(20, result);
    }

    @Test
    public void EncryptASingleCharacterWithKey3Test(){
        CCCryptography ccCryptography = new CCCryptography();
        char result = ccCryptography.encrypt('d', 3);
        assertEquals('g', result);
    }

    @Test
    public void decryptTheCharacterEncryptedAboveTest(){
        CCCryptography ccCryptography = new CCCryptography();
        char result = ccCryptography.decrypt('G', 3);
        assertEquals('d', result);
    }

    @Test
    public void encryptStringWithKey5Test(){
        CCCryptography ccCryptography = new CCCryptography();
        String result = ccCryptography.encrypt("The sky is Blue", 5);
        assertEquals("ymj xpd nx gqzj", result);
    }

    @Test
    public void decryptTheStringEncryptedAboveTest(){
        CCCryptography ccCryptography = new CCCryptography();
        String result = ccCryptography.decrypt("ymj xpd nx gqzj", 5);
        assertEquals("the sky is blue", result);
    }

}