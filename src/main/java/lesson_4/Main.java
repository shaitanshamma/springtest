package lesson_4;


import lesson_4.domen.Product;
import lesson_4.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        //      saveProduct(productService, 10);
        List<Product> productMax = productService.myProductByMaxPrice();
        List<Product> productMin = productService.myProductByMinPrice();
        System.out.println(productMin);
        System.out.println(productMax);

    }

    private static void saveProduct(ProductService productService, int n) {
        String productTitle = "product_";
        int productPrice = 100;
        for (int i = 1; i < n; i++) {
            productService.save(new Product(productTitle + i, productPrice * i));
        }
    }

}
