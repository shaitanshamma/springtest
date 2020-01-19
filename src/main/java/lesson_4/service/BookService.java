package lesson_4.service;

import lesson_4.domen.Book;
import java.util.List;
import java.util.Optional;


public interface BookService {
    List<Book> getAll();

    Optional<Book> get(Long id);

    void save(Book article);

    List<Book> getBookByTitle(String title);
}
