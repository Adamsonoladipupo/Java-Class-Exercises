package data.repositories;

import data.models.BookBorrowed;

public interface BookBorrowedRespository {
    public int count();

    BookBorrowed save(BookBorrowed bookBorrowed);

    void deleteBorrowedBook(BookBorrowed newborrowedBook);

    void deleteByBookBorrowedID(int bookBorrowedID);

    BookBorrowed findBookBorrowedByID(int i);

    void deleteAll();

    boolean existByID(int bookBorrowedID);
}
