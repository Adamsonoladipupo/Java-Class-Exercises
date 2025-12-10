package data.repositories;

import data.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryImplementationTest {
    BookRepositoryImplementation bookRepositoryImplementation;

    @BeforeEach
    public void setUp(){
        bookRepositoryImplementation = new BookRepositoryImplementation();
    }

    @Test
    public void checkIfBookRepositoryIsEmptyTest(){
        assertEquals(0, bookRepositoryImplementation.count());
    }

}