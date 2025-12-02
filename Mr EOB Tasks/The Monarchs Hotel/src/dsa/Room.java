package dsa;

public class Room {
    private String name;
    private int price;
    private int roomNumber;
    private int numberOfRooms = 3;
    private Object[] rooms = new Object[numberOfRooms];


    public void setRoom(String roomName, int roomPrice){
        this.name = roomName;
        this.price = roomPrice;

    }

}
