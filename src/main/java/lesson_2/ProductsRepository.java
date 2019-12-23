package lesson_2;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository {
    List<Product> productsList = new ArrayList<Product>();

    public void addProduct(){
        productsList.add(new Product(1,"Яблоко", 250));
        productsList.add(new Product(2,"Груша", 350));
        productsList.add(new Product(3,"Арбуз", 550));
        productsList.add(new Product(4,"Картофель", 180));
    }
}
