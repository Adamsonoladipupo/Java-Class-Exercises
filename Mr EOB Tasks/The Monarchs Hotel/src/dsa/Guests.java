package dsa;

public class Guests {
    private String name;
    private String email;
    private String phoneNumber;
    private String occupiedRoom;
    private String PIN;
    private Object[] newGuest = new Object[5];
    private int count = 0;

    Guests (){
        this.PIN= null;
        this.name = null;
        this.email = null;
        this.phoneNumber = null;

    }

    Guests(String name, String email, String phoneNumber, String occupiedRoom, String PIN){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.occupiedRoom = occupiedRoom;
        this.PIN = PIN;
    }


    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void addGuest(String name, String mail, String number, String roomNumber, String pin) {
        Guests userOne = new Guests(name, mail, phoneNumber, roomNumber, pin);
        newGuest[count] = userOne;
        count++;
    }

    public String getGuestName() {
        return name;
    }

    public void setName(String name) {
        //if(!name.equalsIgnoreCase())
        this.name = name;
    }

    public String getGuestEmail() {
        return email;
    }

    public String getGuestPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGuestOccupiedRoom() {
        return occupiedRoom;
    }

    public void setOccupiedRoom(String occupiedRoom) {
        this.occupiedRoom = occupiedRoom;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }
}
