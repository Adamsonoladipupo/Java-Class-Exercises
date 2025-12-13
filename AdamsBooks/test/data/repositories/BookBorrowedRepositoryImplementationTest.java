package data.repositories;

import data.models.BookBorrowed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookBorrowedRepositoryImplementationTest {

    BookBorrowedRepositoryImplementation newBookBorrowedRepository;

    @BeforeEach
    public void setUp(){
        newBookBorrowedRepository = new BookBorrowedRepositoryImplementation();
    }

    @Test
    public void CheckIfbookBorrowedRepositoryISEmptTest(){
        assertEquals(0, newBookBorrowedRepository.count());
    }

    @Test
    public void AddABorrowedBookToBookBorrowedRepositoryTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(1, newBookBorrowedRepository.count());
    }

    @Test
    public void AddBorrowedBookToItRepositoryThenDeleteAddedBookTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(1, newBookBorrowedRepository.count());
        newBookBorrowedRepository.deleteBorrowedBook(newborrowedBook);
        assertEquals(0, newBookBorrowedRepository.count());
    }

    @Test
    public void AddMultipleBookBorrowedThenDeleteASpecificBookByItBookBorrowedIDTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        BookBorrowed newborrowedBook2 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook2);
        BookBorrowed newborrowedBook3 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook3);
        assertEquals(3, newBookBorrowedRepository.count());
        newBookBorrowedRepository.deleteByBookBorrowedID(2);
        assertEquals(2, newBookBorrowedRepository.count());
    }

    @Test
    public void AddMultipleBookBorrowedThenFindBookBorrowedByItID(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        BookBorrowed newborrowedBook2 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook2);
        BookBorrowed newborrowedBook3 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook3);
        assertEquals(3, newBookBorrowedRepository.count());
        assertEquals(newborrowedBook3, newBookBorrowedRepository.findBookBorrowedByID(3));
    }

    @Test
    public void AddMultipleBookBorrowedThenFindBookBorrowedThatDoesNotExist(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(1, newBookBorrowedRepository.count());
        assertNull(newBookBorrowedRepository.findBookBorrowedByID(3));
    }

    @Test
    public void AddMultipleBookBorrowedAndDeleteAllBooksInTheRepositoryTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        BookBorrowed newborrowedBook2 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook2);
        BookBorrowed newborrowedBook3 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook3);
        assertEquals(3, newBookBorrowedRepository.count());
        newBookBorrowedRepository.deleteAll();
        assertEquals(0, newBookBorrowedRepository.count());

    }

    @Test
    public void AddMultipleBookBorrowedAndFindCheckIfABookExistByBookBorrowedID(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        BookBorrowed newborrowedBook2 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook2);
        BookBorrowed newborrowedBook3 = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook3);
        assertEquals(3, newBookBorrowedRepository.count());
        assertTrue(newBookBorrowedRepository.existByID(2));
    }

    @Test
    public void AddMultipleBookBorrowedAndCheckForNonExistingBookTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(1, newBookBorrowedRepository.count());
        assertFalse(newBookBorrowedRepository.existByID(2));
    }

    @Test
    public void AddABookBorrowedToTheBookBorrowedRepositoryChangeTheBookBorrowedObjectResaveITTest(){
        BookBorrowed newborrowedBook = new BookBorrowed();
        newborrowedBook.setUserID(200);
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(1, newBookBorrowedRepository.count());
        newborrowedBook.setUserID(250);
        newBookBorrowedRepository.save(newborrowedBook);
        assertEquals(250, newborrowedBook.getUserID());
    }


}