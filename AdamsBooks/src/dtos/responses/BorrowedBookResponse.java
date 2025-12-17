package dtos.responses;

public class BorrowedBookResponse {
    private int bookBorrowedID;
    private int userID;


    public int getBookBorrowedID() {
        return bookBorrowedID;
    }

    public void setBookBorrowedID(int bookBorrowedID) {
        this.bookBorrowedID = bookBorrowedID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
}
