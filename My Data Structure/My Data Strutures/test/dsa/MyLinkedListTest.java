package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList myLinkedList;

    @BeforeEach
    public void setUp() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void checkIfMyLinkedLinkIsEmptyTest() {
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void addAnElementToMyLinkedListTest() {
        myLinkedList.add("Banana");
        assertEquals(1,myLinkedList.size());
        System.out.println(myLinkedList.print());
    }

    @Test
    public void addTwoElementsToMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
//        System.out.println(myLinkedList.print());

    }

    @Test
    public void addAnElementToASpecificIndexInMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        System.out.println(myLinkedList.print());
        myLinkedList.add(1,"NewElement");
        System.out.println(myLinkedList.print());

    }

    @Test
    public void addAnElementToTheFrontOfTheListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        myLinkedList.addFirst("Chain");
        assertEquals(4,myLinkedList.size());
    }

    @Test
    public void addAnElementToTheEndOfTheListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        myLinkedList.addLast("Food");
        assertEquals(4,myLinkedList.size());
    }

    @Test
    public void clearAllElementsInMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        myLinkedList.clear();
        assertEquals(0,myLinkedList.size());
    }

    @Test
    public void checkIfAnElementIsContainedInMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        assertTrue(myLinkedList.contains("Banana"));
    }

    @Test
    public void checkIfAnElementIsNotContainedInMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        assertFalse(myLinkedList.contains("Kulikuli"));
    }

    @Test
    public void getTheFirstElementInTheLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        Object check = myLinkedList.element();
        assertEquals("Banana", check);
    }

    @Test
    public void getTheElementInASpecificPositionInMyLinkedListTest() {
        myLinkedList.add("Banana");
        myLinkedList.add(2002);
        myLinkedList.add("Snack");
        assertEquals(3,myLinkedList.size());
        Object got = myLinkedList.get(1);
        assertEquals(2002, got);
    }
}