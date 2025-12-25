package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList myArrayList;

    @BeforeEach
    public void setUp(){
        myArrayList = new MyArrayList();
    }

    @Test
    public void CheckIFMyArrayListIsEmptyTest(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void AddOneItemToMyArrayListTest(){
        myArrayList.add("Book");
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void AddOneItemToMyArrayListAndRemoveTheAddedItemTest(){
        myArrayList.add("Book");
        assertFalse(myArrayList.isEmpty());
        assertTrue(myArrayList.remove("Book"));
    }

    @Test
    public void AddMultipleItemsToMyArrayListAndClearTheListTes(){
        myArrayList.add("Book");
        myArrayList.add("Pen");
        myArrayList.add("Eraser");
        myArrayList.add("Biro");
        myArrayList.add("Ruler");
        assertFalse(myArrayList.isEmpty());
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void AddMultipleItemsToMyArrayListAndCheckTheNumberOfItemsInTheListTest(){
        myArrayList.add("Book");
        myArrayList.add("Pen");
        myArrayList.add("Eraser");
        myArrayList.add("Biro");
        myArrayList.add("Ruler");
        assertFalse(myArrayList.isEmpty());
        assertEquals(5, myArrayList.size());
    }

}