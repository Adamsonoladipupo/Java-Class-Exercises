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

    public void addRoom() {

        exitingRooms++;
    }

    public int numberOfRooms() {
        return exitingRooms;
    }

    public void removeRoom() {
        exitingRooms--;
    }


    public Object getNumber() {
        return roomNumber;
    }
    public Object getRoomType() {
        return type;
    }
    public Object getRoomPrice() {
        return price;
    }
    public Object getRoomEmptyStatus() {
        return isRoomEmpty;
    }
    public Object getRoomMaintenanceStatus() {
        return underManitenance;
    }


}
