package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {
    Guests newGuest;

    @BeforeEach
    void setUp(){
        newGuest = new Guests();

    }

    @Test
    public void test_if_guests_list_is_empty(){
        newGuest.isEmpty();
        assertTrue(newGuest.isEmpty());
        assertEquals( 0,newGuest.size());
    }

    @Test
    public void test_if_guest_list_is_not_empty(){
        assertTrue(newGuest.isEmpty());
        newGuest.addGuest("Adams", "adamson@gmail.com", "08166666666", "001");
        assertFalse(newGuest.isEmpty());
        assertEquals( 1,newGuest.size());
    }

    @Test
    public void test_if_user_as_a_name(){
        newGuest.setName("Adams");
        assertEquals( "Adams", newGuest.getName());
    }

    @Test
    public void test_if_user_as_a_email(){
        newGuest.setEmail("Adams@gmail.com");
        assertEquals( "Adams@gmail.com", newGuest.getEmail());
    }

    @Test
    public void test_if_user_as_a_phone_number(){
        newGuest.setPhoneNumber("081266666666");
        assertEquals( "081266666666", newGuest.getPhoneNumber());
    }



}
