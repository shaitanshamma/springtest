package lesson_4.service;

import lesson_4.domen.Book;
import lesson_4.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service("bookService")
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    @Autowired
    @Qualifier("bookRepository")
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
