package dsa;

import java.util.ArrayList;

public class PrintMenuMethods {

    public static void firstMenu(){
        String message = """

                ==> I AM MONARCH HOTEL 0.1 <==
                
                I have been created to ease your 
                hotel management process . . .
                
                => Enter your NAME and PIN to own me.
                """;
        System.out.print(message);
    }
    public static void mainMenu(){
        String Menu = """
            
            Welcome to The Monarchs Hotel App
            
            1. Enter as an Admin
            2. Enter as a Guest
            
            0. Exit
            
            """;
        System.out.print(Menu);
    }

    public static void adminMenu(String name){
        String Menu = """
                Welcome, Madam %s
                
                1. View All Rooms
                2. Manage Reservations
                3. Generate Reports
                4. Mark Rooms for Maintenance
                5. Add rooms
                6. View guest Details
                
                0. Back
                """;
        System.out.printf(Menu, name);
    }

    public static void guestMenu1(){
        String Menu = """
            Welcome, Our Esteemed Customer!
            
            1. Enter as a new guest
            2. Enter as a returning Guest
            
            0. Back
            
            """;
        System.out.print(Menu);
    }

    public static void guestMenu2(){
        String Menu = """
                Welcome, Our Esteemed __Customer__ 
                
                1. Book Room
                2. View Booking
                3. Edit Profile
                4. Check Room Availability
                5. Payment Status
                6. Cancel Booking
                7. View All Available Room
                8. View Notification
                
                0. Back
                """;
        System.out.print(Menu);
    }
    public static void successfulAction(){
        String message = """
                
                action performed successfully . . .
                
                """;
        System.out.print(message);
    }

    public static void guestDetails(){

    }
    public static void roomDetails(){
        String details = """
                
                Room Details
                Room Number: 
                Type: 
                Price per night: 
                Total payment: 
                Booking reference number: 
                Check in date:
                Check out date: 
                
                """;

    }
    
    public static void allAvailableRooms(ArrayList<Room> allRooms){
        System.out.println("All ROOMs");
        for (Room room : allRooms){
            System.out.println("-----------------------------------------");
            System.out.println("Room Number: " + room.getNumber());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Room Price: ₦" + room.getRoomPrice());
            System.out.println("Room is Empty: " + room.getRoomEmptyStatus());
            System.out.println("Room under maintenance: " + room.getRoomMaintenanceStatus());
            System.out.println("-----------------------------------------");
        }
    }

    public static void allAvailableGuests(ArrayList<Guests> allGuests){
        System.out.println("All ROOMs");
        for (Guests guest : allGuests){
            System.out.println("-----------------------------------------");
            System.out.println("Guest Name: " + guest.getGuestName());
            System.out.println("Guest Phone Number: " + guest.getGuestPhoneNumber());
            System.out.println("Room Email: " + guest.getGuestEmail());
            System.out.println("-----------------------------------------");
        }
    }


}
