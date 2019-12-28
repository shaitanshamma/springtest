package lesson_2.service;

import lesson_2.Product;
import lesson_2.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private ProductsRepository productsRepository;
    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository){
        this.productsRepository=productsRepository;
    }
    public Product getProductById(int id) {
        // Optional<Student> studentOp = Optional.of(studentRepository.findOneById(id));
        Product product = productsRepository.findOneById(id);
        return product;
    }
}
