package dtos.requests;

import data.models.BookBorrowed;

import java.util.ArrayList;

public class AddUserRequest {
    private String name;
    private String phoneNubmber;
    private String address;
    private ArrayList <BookBorrowed> borrowedBooks = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNubmber() {
        return phoneNubmber;
    }   

    public void setPhoneNubmber(String phoneNubmber) {
        this.phoneNubmber = phoneNubmber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<BookBorrowed> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<BookBorrowed> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
