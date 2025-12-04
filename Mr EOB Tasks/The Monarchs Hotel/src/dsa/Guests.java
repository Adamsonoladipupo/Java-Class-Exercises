package dsa;

public class Guests {
    private String name;
    private String email;
    private String phoneNumber;
    private String occupiedRoom;
    private String PIN;
    private Object[] guestList = new Object[10];
    private int count = 0;

    Guests (){
        this.PIN= null;
        this.name = null;
        this.email = null;
        this.phoneNumber = null;

    }

    Guests(String name, String email, String phoneNumber, String PIN){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.PIN = PIN;
    }


    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void addGuest(String name, String mail, String number, String roomNumber) {
        Guests userOne = new Guests(name, mail, phoneNumber, roomNumber);
        guestList[count] = userOne;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if(!name.equalsIgnoreCase())
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupiedRoom() {
        return occupiedRoom;
    }

    public void setOccupiedRoom(String occupiedRoom) {
        this.occupiedRoom = occupiedRoom;
    }
}
