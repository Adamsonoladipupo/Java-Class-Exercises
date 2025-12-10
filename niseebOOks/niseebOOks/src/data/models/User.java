package data.models;

import java.util.ArrayList;

public class User {
    private String name;
    private String phoneNumber;
    private String userID;
    private String address;
    private ArrayList<String> borrowedBook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(ArrayList<String> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}
