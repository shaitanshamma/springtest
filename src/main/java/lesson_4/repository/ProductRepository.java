package lesson_4.repository;

import lesson_4.domen.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByTitle(String title);
//    @Query("select p from Product p where p.price > 100")
//    List<Product> myProductByPrice();
}
