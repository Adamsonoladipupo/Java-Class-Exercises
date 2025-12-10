package data.models;

public class BorrowedBook {
    private String bookID;
    private String userID;
    private int timeBorrowed;
    private int timeReturn;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
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
