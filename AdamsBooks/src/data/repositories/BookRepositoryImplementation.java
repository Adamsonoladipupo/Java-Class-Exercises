package data.repositories;

import data.models.Book;

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
        if(isNew(book)) saveNew(book);
        else updateBook(book);
        return book;
    }

    private void saveNew(Book book) {
        count++;
        book.setID(count);
        books.add(book);
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

    @Override
    public void updateBook(Book newBook) {
        for ( Book book : books){
            if (book.getID() == newBook.getID()){
                book = newBook;
            }
        }
    }

    public boolean isNew(Book book) {
        return book.getID() == 0;
    }

}
