package lesson_4.domen;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
@NamedQuery(name="Book.findAll", query="SELECT e FROM Book e")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    public Long getId() {
        return id;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "books_readers", // название таблицы
            joinColumns = @JoinColumn(name = "book_id"),  // то что связываем
            inverseJoinColumns = @JoinColumn(name = "reader_id") // то на что связываем
    )
    private List<Reader> readers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;
//
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [" + id + " " + title + "]";
    }
//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + " " + author.getName() + "]";
//    }


    public Book(String title) {
        this.title = title;
    }

    public Book() {
    }

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
