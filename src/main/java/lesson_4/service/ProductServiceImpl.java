package lesson_4.service;

import lesson_4.domen.Product;
import lesson_4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    @Qualifier("productRepository")
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> get(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getProductByTitle(String title) {
        return productRepository.findByTitle(title);
    }

    @Override
    public List<Product> myProductByMaxPrice() {
        return entityManager.createQuery("from Product where price = (select max(price) from Product )", Product.class)
                .getResultList();
    }

    @Override
    public List<Product> myProductByMinPrice() {
        return entityManager.createQuery("from Product where price = (select min(price) from Product )", Product.class)
                .getResultList();
    }

    @Override
    public List<Product> myAwerageProduct(int min, int max) {
        return productRepository.findByPriceBetween(min, max);
    }

}
