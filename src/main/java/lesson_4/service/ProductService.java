package lesson_4.service;

import lesson_4.domen.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface ProductService<T> {
    List<Product> getAll();

    Optional<Product> get(Long id);

    void save(Product product);

    List<Product> getProductByTitle(String title);

    List<Product> myProductByMaxPrice();
    List<Product> myProductByMinPrice();
}
