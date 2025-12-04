package dsa;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Room> allRooms = new ArrayList<>();
        ArrayList <Guests> allGuests = new ArrayList<>();

        PrintMenuMethods.firstMenu();
        System.out.print("Enter your name: ");
        String admin = input.nextLine();
        System.out.print("Enter your admin PIN: ");
        String adminPin = input.nextLine();
        Admin newAdmin = new Admin(admin, adminPin);

        String userInput = "5";
        while(!userInput.equalsIgnoreCase("0")){
            PrintMenuMethods.mainMenu();
            System.out.print("Make a selection to proceed: ");
            userInput = input.nextLine();
            switch(userInput){
                case "1" ->{
                    System.out.printf("Hey %s, enter your PIN to sign in: ", newAdmin.getName());
                    String adminLog = input.nextLine();
                    if (!adminLog.equalsIgnoreCase(newAdmin.getPin())){
                        System.out.print("Access denied!!!");
                        break;
                    }
                    else {
                        PrintMenuMethods.adminMenu(newAdmin.getName());
                    }
                    System.out.print("Make a selection to proceed: ");
                    String adminInput = "11";
                    while(!adminInput.equalsIgnoreCase("0")){
                        adminInput = input.nextLine();
                        switch (adminInput){
                            case "1" ->{
                                if(allRooms.size() <= 0){
                                    System.out.println("No rooms available");
                                    System.out.print("Make a selection to proceed: ");
                                }
                                else{
                                    PrintMenuMethods.allAvailableRooms(allRooms);
                                }
                            }
                            case "2" ->{
                                if(allRooms.size() <= 0){
                                    System.out.println("No rooms available");
                                    System.out.print("Make a selection to proceed: ");
                                }
                                else{
                                    System.out.print("Loading Reservation ");
                                }
                            }
                            case "3" ->{
                                if(allRooms.size() <= 0){
                                    System.out.println("No rooms available");
                                    System.out.print("Make a selection to proceed: ");
                                }
                                else{
                                    System.out.print("Generating Report ");
                                }
                            }
                            case "4" ->{
                                if(allRooms.size() <= 0){
                                    System.out.println("No rooms available");
                                    System.out.print("Make a selection to proceed: ");
                                }
                                else{
                                    System.out.print("Checking rooms for maintenance");
                                }
                            }
                            case "5" ->{
                                System.out.print("Enter room number(3 digits): ");
                                String roomNumber = input.nextLine();
                                System.out.print("Room type(single,double, suit): ");
                                String roomType = input.nextLine();
                                System.out.print("Enter room price: ");
                                int roomPrice = input.nextInt();
                                boolean isEmpty = true;
                                boolean isUnderMaintenance = false;
                                Room newRoom = new Room(roomNumber, roomType, roomPrice, isEmpty, isUnderMaintenance);
                                allRooms.add(newRoom);
                                PrintMenuMethods.successfulAction();

                            }
                            case "6" ->{
                                if( allGuests.size() <= 0){
                                    System.out.println("No guest available");
                                    System.out.print("Make a selection to proceed: ");
                                }
                                else{
                                    PrintMenuMethods.allAvailableGuests(allGuests);
                                }
                            }
                            default -> {System.out.print("Invalid input");}
                        }
                    }


                }
                case "2" ->{
                    PrintMenuMethods.guestMenu1();
                    System.out.print("Make a selection to proceed: ");
                    String guestInput = "11";
                    while(!guestInput.equalsIgnoreCase("0")) {
                        guestInput = input.nextLine();
                        switch (guestInput){
                            case "1" ->{
                                System.out.println("Entering as a new guest . . .");
                                System.out.print("Enter your name: ");
                                String guestName = input.nextLine();
                                System.out.print("Enter your phone number: ");
                                String guestPhoneNumber = input.nextLine();
                                System.out.print("Enter your email: ");
                                String guestEmail = input.nextLine();
                                System.out.print("Pick a PIN: ");
                                String guestPin = input.nextLine();
                                String occupiedRoom = null;
                                Guests newGuest = new Guests(guestName, guestPhoneNumber, guestEmail, occupiedRoom, guestPin);
                                allGuests.add(newGuest);
                                PrintMenuMethods.successfulAction();
                                break;
                            }
                            case "2" ->{
                                System.out.println("Entering as a returning guest");
                                System.out.print("Enter your name: ");
                                String guestName = input.nextLine();
                                System.out.print("Enter your PIN: ");
                                String guestPin = input.nextLine();
                                PrintMenuMethods.guestMenu2();
                                String newGuestInput = "11";
                                while(!newGuestInput.equalsIgnoreCase("0")){
                                    newGuestInput = input.nextLine();
                                    switch (newGuestInput){
                                        case "1" ->{
                                            System.out.println("Booking a room . . .");
                                            System.out.print("Select a room type(Single/Double/Suite): ");

                                            System.out.print("Enter number of nights: ");
                                            PrintMenuMethods.successfulAction();

                                        }
                                        case "2" ->{
                                            System.out.print("View booking");
                                        }
                                        case "3" ->{
                                            System.out.print("Edit profile");
                                        }
                                        case "4" ->{
                                            System.out.print("Check room availability");
                                        }
                                        case "5" -> {
                                            System.out.print("Payment Statuc");
                                        }
                                        case "6" -> {
                                            System.out.print("Cancel booking");
                                        }
                                        case "7" -> {
                                            System.out.print("View Available room");
                                        }
                                        case "8" -> {
                                            System.out.print("View notification");
                                        }
                                        default -> {System.out.print("Invalid input");}
                                    }

                                }
                            }
                            default -> {System.out.print("Invaid input");}
                        }
                    }
                }
                case "0" ->{
                    System.out.print("Thank You for using our Hospital");
                }
                default -> {
                    System.out.print("Invalid input");
                }
            }
        }



    }
}
