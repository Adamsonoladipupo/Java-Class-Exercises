package data.repositories;

import data.models.Book;

import java.util.ArrayList;

class BookRepositoryImplementation implements BookRepository {
    private int count = 0;
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public long count() {
        return count;
    }

    @Override
    public void save(Book book) {
        books.add(book);
        this.count++;
    }



}