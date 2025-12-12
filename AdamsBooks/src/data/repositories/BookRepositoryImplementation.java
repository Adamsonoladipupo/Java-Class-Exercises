package data.repositories;

import data.models.Book;
import data.models.Genre;

import java.util.ArrayList;

public class BookRepositoryImplementation implements BookRepository{
    int count = 0;
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public int count() {
        return count;
    }

    @Override
    public Book save(Book book) {
        count++;
        book.setID(count);
        book.setName("Be an Expert in Java within 4days");
        book.setAuthor("I am not");
        book.setDescription("write java codes to solve real like problems in less than four days");
        book.setEdition(33);
        book.setGenre(Genre.HORROR);
        book.setPages(350);
        books.add(book);
        return book;
    }

    @Override
    public int amountOfBook() {
        return books.size();
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
        count--;
    }

    @Override
    public Book findBookByID(int id) {
        for ( Book book : books){
            if (book.getID() == id){
                return book;
            }
        }
        return null;
    }

    @Override
    public void deleteByID(int id) {
        for ( Book book : books){
            if (book.getID() == id){
                delete(book);
            }
        }
    }

    @Override
    public void deleteAll() {
        books.clear();
    }

    @Override
    public boolean existById(int id) {
        for ( Book book : books){
            if (book.getID() == id){
                return true;
            }
        }
        return false;
    }

}
