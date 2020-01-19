package lesson_4.repository;

import lesson_4.domen.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    List<Product> findByTitle(String title);

    //    @Query("select p from Product p where p.price > 100")
//    List<Product> myProductByPrice();
    List<Product> findByPriceBetween(int min, int max);
}
