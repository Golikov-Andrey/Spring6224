package ru.maliutin.task_3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maliutin.task_3.models.Product;
import ru.maliutin.task_3.services.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public String getProductS(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Model model){
        productService.addProduct(p);
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

}
