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

}
