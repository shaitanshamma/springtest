package lesson_3;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Book> books;

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author() {
    }

    @Override
    public String toString() {
        String allBooks = "";
        for (Book o : books) {
            allBooks += o.getTitle() + " ";
        }
        return "Author [" + id + " " + name + " " + allBooks + "]";
       // return "Author [" + id + " " + name + "]";
    }
}