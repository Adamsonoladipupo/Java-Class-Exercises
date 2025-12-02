package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueV2Test {
    @Test
    void test_if_my_queue_is_empty(){
        MyQueueV2 newQueue = new MyQueueV2();
        assertTrue(newQueue.isEmpty());
    }


    @Test
    void test_if_my_queue_is_not_empty(){
        MyQueueV2 newQueue = new MyQueueV2();
        newQueue.add("Balloon");
        assertFalse(newQueue.isEmpty());
        assertTrue(newQueue.add("Beans"));
    }

    @Test
    void test_if_item_can_be_removed_from_the_queue(){
        MyQueueV2 newQueue = new MyQueueV2();
        newQueue.add("Balloon");
        newQueue.add("Ball");
        newQueue.add("Banana");
        assertEquals("Balloon" , newQueue.remove());

    }

    @Test
    void test_that_item_cannot_be_poll_from_an_empty_queue(){
        MyQueueV2 newQueue = new MyQueueV2();
        assertEquals(null, newQueue.poll());
    }

    @Test
    void test_that_item_can_be_poll_from_my_queue(){
        MyQueueV2 newQueue = new MyQueueV2();
        newQueue.add("Bola");
        newQueue.add("Ball");
        assertFalse(newQueue.isEmpty());
        assertEquals("Bola", newQueue.poll());
    }

    @Test
    void test_that_item_cannot_be_retrieved_from_an_empty_test(){
        MyQueueV2 newQueue = new MyQueueV2();
        assertTrue(newQueue.isEmpty());
        assertEquals(null, newQueue.peek());
    }

    @Test
    void trst_that_item_can_be_retrived_from_my_queue(){
        MyQueueV2 newQueue = new MyQueueV2();
        newQueue.add("Bola");
        newQueue.add("Ball");
        assertFalse(newQueue.isEmpty());
        assertEquals("Bola", newQueue.peek());
    }
}
