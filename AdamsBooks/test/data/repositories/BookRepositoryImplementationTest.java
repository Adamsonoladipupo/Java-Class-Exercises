package data.repositories;

import data.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryImplementationTest {
    BookRepositoryImplementation bookRepositoryImplementation;
    Book book;

    @BeforeEach
    public void setUp(){
        bookRepositoryImplementation = new BookRepositoryImplementation();
        book = new Book();
    }

    @Test
    public void checkIfBookRepositoryIsEmptyTest(){
        assertEquals(0, bookRepositoryImplementation.count());
    }

    @Test
    public void addBookIntoTheBookRepository(){
        bookRepositoryImplementation.save(book);
        assertEquals(1, bookRepositoryImplementation.amountOfBook());
    }

    @Test
    public void add2BooksToTheLibraryAndDelete1AddedBookTest(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        assertEquals(2, bookRepositoryImplementation.amountOfBook());
        bookRepositoryImplementation.delete(book);
        assertEquals(1, bookRepositoryImplementation.amountOfBook());
    }

    @Test
    public void addAbookToTheBookRepositoryThenFindByIDTest(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        Book book3 = new Book();
        bookRepositoryImplementation.save(book3);
        assertEquals(3, bookRepositoryImplementation.amountOfBook());
        Book foundBook = bookRepositoryImplementation.findBookByID(2);
        assertEquals(2, foundBook.getID());
    }

    @Test
    public void addABookToTheBookRepositoryThenFindAbookThatThoseNotExitByIDTest(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        assertEquals(2, bookRepositoryImplementation.amountOfBook());
        Book foundBook = bookRepositoryImplementation.findBookByID(3);
        assertNull(foundBook);
    }

    @Test
    public void addBooksToTheBookRepositoryThenDeleteABookByID(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        Book book3 = new Book();
        bookRepositoryImplementation.save(book3);
        assertEquals(3, bookRepositoryImplementation.amountOfBook());
        Book foundBook = bookRepositoryImplementation.findBookByID(2);
        assertEquals(2, foundBook.getID());
        bookRepositoryImplementation.deleteByID(2);
        assertEquals(2, bookRepositoryImplementation.amountOfBook());
    }

    @Test
    public void addBooksToTheBookRepositoryThenDeleteAllBooks(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        Book book3 = new Book();
        bookRepositoryImplementation.save(book3);
        assertEquals(3, bookRepositoryImplementation.amountOfBook());
        bookRepositoryImplementation.deleteAll();
        assertEquals(0, bookRepositoryImplementation.amountOfBook());
    }

    @Test
    public void AddBookToTheRepositoryThenCheckIfAParticularBookExistUsingItID(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        Book book3 = new Book();
        bookRepositoryImplementation.save(book3);
        assertEquals(3, bookRepositoryImplementation.amountOfBook());
        assertTrue(bookRepositoryImplementation.existById(2));
    }

    @Test
    public void AddBookToTheRepositoryThenCheckIfAParticularBookExistUsingItIDTest(){
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        bookRepositoryImplementation.save(book2);
        Book book3 = new Book();
        bookRepositoryImplementation.save(book3);
        assertEquals(3, bookRepositoryImplementation.amountOfBook());
        assertFalse(bookRepositoryImplementation.existById(4));
    }

    @Test
    public void AddAbookToTheBookRepositoryAndUpdateTheBookNameTest(){
        Book newbook = new Book();
        newbook.setIsbn(200);
        bookRepositoryImplementation.save(newbook);
        assertEquals(200, newbook.getIsbn());
        assertEquals(1, bookRepositoryImplementation.amountOfBook());
        newbook.setIsbn(300);
        bookRepositoryImplementation.save(newbook);
        assertEquals(300, newbook.getIsbn());
    }


}