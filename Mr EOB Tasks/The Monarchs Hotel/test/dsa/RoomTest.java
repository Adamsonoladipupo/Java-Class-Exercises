package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoomTest {

    Room newRoom;

    @BeforeEach
    public void setUp(){
        newRoom = new Room();
    }

    @Test
    public void room_empty_test(){
        assertTrue(newRoom.isEmpty());
    }

    @Test
    public void add_1_room_test(){
        newRoom.addRoom();
        assertEquals(1, newRoom.numberOfRooms());
    }

    @Test
    public void added_2_rooms_remove_1_room_remaining_1_room(){
        newRoom.addRoom();
        newRoom.addRoom();
        assertEquals(2, newRoom.numberOfRooms());
        newRoom.removeRoom();
        assertEquals(1, newRoom.numberOfRooms());
    }



}
