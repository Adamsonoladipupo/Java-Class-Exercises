package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Modul026Test {

    @Test
    public void calculateTheModuloOfANumberTest(){
        Modul026 modul026 = new Modul026(8);
        assertEquals(8, modul026.mod26());
    }

}