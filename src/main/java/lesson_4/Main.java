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
        //saveProduct(productService, 20);
        List<Product> productMax = productService.myProductByMaxPrice();
        List<Product> productMin = productService.myProductByMinPrice();
        List<Product> productAwerage = productService.myAwerageProduct(200,800);
        System.out.println(productMin);
        System.out.println(productMax);
        System.out.println(productAwerage);

    }

    private static void saveProduct(ProductService productService, int n) {
        String productTitle = "product_";
        int productPrice = 100;
        for (int i = 1; i < n; i++) {
            productService.save(new Product(productTitle + i, productPrice * i));
        }
    }

}
