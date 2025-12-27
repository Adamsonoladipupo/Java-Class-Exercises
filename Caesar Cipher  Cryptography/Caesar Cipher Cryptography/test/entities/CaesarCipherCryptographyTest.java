package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherCryptographyTest {

    @Test
    public void encryptAAlphabetTest(){
        CaesarCipherCryptography caesarCipherCryptography = new CaesarCipherCryptography();
        caesarCipherCryptography.encrypt('a', 3);
    }

}