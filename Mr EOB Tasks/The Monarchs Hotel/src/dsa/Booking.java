package dsa;

public class Booking {
    private String guestName;
    private String roomNumber;
    private int numberOfNight;
    private int date;
    private String refNumber;

    private int count = 0;

    Booking(){
        this.guestName = null;
        this.roomNumber = null;
        this.date = 0;
        this.numberOfNight = 0;
    }
    Booking(String guestName, String roomNumber, int numberOfNight, int date, String refNumber){
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.numberOfNight = numberOfNight;
        this.date = date;
        this.refNumber = refNumber;
    }

    public int bookingSize(){
        return count;
    }

    public void makeBookings(String guestName, String roomName, int date, int cost) {
        count++;
    }
}
