package data.repositories;

import data.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {
    BookRepositoryImplementation bookRepositoryImplementation;
    Book book;

    @BeforeEach
    public void setUp(){
        bookRepositoryImplementation = new BookRepositoryImplementation();
        book = new Book();
    }

    @Test
    public void testThatLibraryIsEmpty(){
        assertEquals(0,bookRepositoryImplementation.count());
    }

    @Test
    public void addANewBookToTheLibraryByBookIDTest(){
        bookRepositoryImplementation.save(book);
        assertEquals(1,bookRepositoryImplementation.count());
    }


}