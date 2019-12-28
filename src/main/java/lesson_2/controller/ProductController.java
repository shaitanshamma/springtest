package lesson_2.controller;


import lesson_2.Product;
import lesson_2.ProductsRepository;
import lesson_2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.GET)
    public String showProductForm(Model model) {

        Product product = new Product();
        model.addAttribute("productForm", product);
        return "productAdd";
    }
    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    public String saveOrUpdateUser(@ModelAttribute("productForm") Product product, BindingResult result, Model model) {
        model.addAttribute("title", product.getTitle());
        model.addAttribute("cost", product.getCost());
        return "resultProduct";
    }
    @RequestMapping("/showProduct")
    public String hello(Model uiModel, @ModelAttribute("student") Product product) {
        product = productService.getProductById(2);
        uiModel.addAttribute("product", product);
        System.out.println(product.getId() + " " + product.getCost() + " " + product.getTitle());
        return "product";
    }

}
