package dsa;

public class Room {
    private String roomNumber;
    private String type;
    private int price;
    private boolean isRoomEmpty;
    private boolean underManitenance;



    private Object[] roomDetails = new Object[5];
    private int exitingRooms = 0;

    Room(){
        this.roomNumber = null;
        this.type = null;
        this.price = 0;
        this.isRoomEmpty = true;
        this.underManitenance = false;
    }

    Room(String roomNumber, String roomType, int roomPrice, boolean isRoomEmpty, boolean underManitenance){
        this.roomNumber = roomNumber;
        this.type = roomType;
        this.price = roomPrice;
        this.isRoomEmpty = isRoomEmpty;
        this.underManitenance = underManitenance;
    }

    public boolean isEmpty() {
        return exitingRooms == 0;
    }

    public void addRoom(String roomNumber, String roomType, int roomPrice, boolean isRoomEmpty, boolean underManitenance) {

        roomDetails[0] = roomNumber;
        roomDetails[1] = roomType;
        roomDetails[2] = roomPrice;
        roomDetails[3] = isRoomEmpty;
        roomDetails[4] = underManitenance;

        exitingRooms++;
    }

    public int numberOfRooms() {
        return exitingRooms;
    }

    public void removeRoom() {
        exitingRooms--;
    }


    public Object getRoom() {
        return roomDetails;
    }
}
