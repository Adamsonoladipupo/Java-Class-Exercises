package data.repositories;

import data.models.Book;

public interface BookRepository {
    int count();

    Book save(Book book);

    int amountOfBook();

    void delete(Book book);

    Book findBookByID(int id);

    void deleteByID(int id);

    void deleteAll();

    boolean existById(int i);
}
