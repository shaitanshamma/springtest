package lesson_4.repository;

import lesson_4.domen.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookRepository")
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
