package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToIntegerTest {

    @Test
    public void convertInputToIntTest(){
        ToInteger toInteger = new ToInteger('a');
        assertEquals(0, toInteger.getInt());
    }

    @Test
    public void convertInvalidInputToIntegerTest(){
        ToInteger toInteger = new ToInteger(' ');
        assertEquals(0, toInteger.getInt());
    }
}