package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToStringTest {

    @Test
    public void convertInputT0CharTest(){
        ToString toString = new ToString(100);
        assertEquals('d', toString.getChar());
    }

}