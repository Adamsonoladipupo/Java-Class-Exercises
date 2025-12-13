package data.repositories;

import data.models.BookBorrowed;

import java.util.ArrayList;

public class BookBorrowedRepositoryImplementation implements BookBorrowedRespository{
    private int count = 0;
    private ArrayList <BookBorrowed> booksBorrowed = new ArrayList<>();


    @Override
    public int count() {
        return count;
    }

    @Override
    public BookBorrowed save(BookBorrowed bookBorrowed) {
        if (isNew(bookBorrowed)){
            saveNew(bookBorrowed);
            return bookBorrowed;
        } else upadateBookBorrowed(bookBorrowed);
        return null;
    }

    @Override
    public void deleteBorrowedBook(BookBorrowed newborrowedBook) {
        booksBorrowed.remove(newborrowedBook);
        count--;
    }

    @Override
    public void deleteByBookBorrowedID(int bookBorrowedID) {
        int bookIndex = 0;
        for (BookBorrowed bookBorrowed : booksBorrowed){
            if (bookBorrowed.getBookBorrowedID() == bookBorrowedID);{
                bookIndex = booksBorrowed.indexOf(bookBorrowed);
            }
        }
        booksBorrowed.remove(bookIndex);
        count--;
    }

    @Override
    public BookBorrowed findBookBorrowedByID(int bookBorrowedID) {
        for (BookBorrowed bookBorrowed : booksBorrowed){
            if (bookBorrowed.getBookBorrowedID() == bookBorrowedID){
                return bookBorrowed;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        booksBorrowed.clear();
        count=0;
    }

    @Override
    public boolean existByID(int bookBorrowedID) {
        for (BookBorrowed bookBorrowed : booksBorrowed){
            if (bookBorrowed.getBookBorrowedID() == bookBorrowedID){
                return true;
            }
        }
        return false;
    }


    private void upadateBookBorrowed(BookBorrowed newBookBorrowed) {
        for (BookBorrowed bookBorrowed : booksBorrowed){
            if (bookBorrowed.getBookBorrowedID() == newBookBorrowed.getBookBorrowedID()){
                bookBorrowed = newBookBorrowed;
            }
        }
    }

    private void saveNew(BookBorrowed bookBorrowed) {
        count++;
        bookBorrowed.setBookBorrowedID(count);
        booksBorrowed.add(bookBorrowed);
    }

    private boolean isNew(BookBorrowed bookBorrowed) {
        return bookBorrowed.getBookBorrowedID() == 0;
    }
}
