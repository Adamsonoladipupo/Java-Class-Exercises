package data.repositories;

import data.models.Book;

public interface BookRepository {
    public long count();
    public void save(Book book);


}
