package lesson_3;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client_choice")
public class ClientChoice {

    public ClientChoice() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Column(name = "id_client")
    private int id_client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Column(name = "product_id")
    private int product_id;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

    @ManyToMany
    @JoinTable(
            name = "product_buyers",
            joinColumns = @JoinColumn(name = "client_choice_id_client"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )

    private List<Product> products;
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        String allProducts = "";
        for (Product o : products) {
            allProducts += o.getTitle() + " ";
        }
        return "Clients_choice [" + id + " " + id_client + " " + allProducts + "]";
    }
}
