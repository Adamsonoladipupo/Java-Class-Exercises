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

    @Test
    public void AddThreeElemetsToMysatckAndPopOneTest(){
        myStack.push("Ball");
        myStack.push("Egg");
        myStack.push("Sabo");
        assertFalse(myStack.empty());
        assertEquals("Sabo",myStack.pop());
    }

    @Test
    public void AddElementsToMysatckAndGetTheElementAtTheTopOfTheStackTest(){
        myStack.push("Egg");
        myStack.push("Sabo");
        assertFalse(myStack.empty());
        assertEquals("Sabo", myStack.peek());
    }

    @Test
    public void AddElementsToMystackAndSearchForThePositionOfAParticularElementInTheStackTest(){
        myStack.push("Egg");
        myStack.push("Sabo");
        myStack.push("Yaba");
        myStack.push("Nerd");
        assertFalse(myStack.empty());
        assertEquals(3, myStack.search("Yaba"));
    }


}