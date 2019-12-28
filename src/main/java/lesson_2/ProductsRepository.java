package lesson_2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ProductsRepository {
    List<Product> productsList = new ArrayList<Product>();

    public void addProduct(){

    }

    public Product findOneById(int id) {
        Product product = new Product();
        product.setId(1 + id);
        product.setTitle("Apple " + id);
        product.setCost(1212 + id);
        return product;
    }
}
