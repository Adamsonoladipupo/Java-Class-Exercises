package data.models;

public class BookBorrowed {
    private int bookBorrowedID;
    private int bookID;
    private int userID;
    private int timeBorrowed;
    private int timeReturn;


    public int getBookBorrowedID() {
        return bookBorrowedID;
    }

    public void setBookBorrowedID(int bookBorrowedID) {
        this.bookBorrowedID = bookBorrowedID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTimeBorrowed() {
        return timeBorrowed;
    }

    public void setTimeBorrowed(int timeBorrowed) {
        this.timeBorrowed = timeBorrowed;
    }

    public int getTimeReturn() {
        return timeReturn;
    }

    public void setTimeReturn(int timeReturn) {
        this.timeReturn = timeReturn;
    }
}
