package lesson_3;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "product_buyers", // название таблицы
            joinColumns = @JoinColumn(name = "product_id"),  // то что связываем
            inverseJoinColumns = @JoinColumn(name = "client_id") // то на что связываем
    )
    private List<Client> clients;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "client_id")
//    private Client client;
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [" + id + " " + title + " " + price + "]";
    }
}
