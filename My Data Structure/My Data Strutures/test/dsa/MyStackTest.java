package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack myStack;

    @BeforeEach
    public void setUp(){
        myStack = new MyStack(10);
    }

    @Test
    public void CheckIfMyStackIsEmptyTest(){
        assertTrue(myStack.empty());
    }

    @Test
    public void AddOneElementToMysatckTest(){
        myStack.push("Ball");
        assertFalse(myStack.empty());
    }

    @Test
    public void AddOneElementToMysatckAndRemoveTheElementTest(){
        myStack.push("Ball");
        assertFalse(myStack.empty());
        assertEquals("Ball",myStack.pop());
        assertTrue(myStack.empty());
    }



}