package com.example.demo.controllers;


import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class buyProductController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/buyproduct")
    public String buyproduct(@RequestParam("productID") int theID){
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product prod = productService.findById(theID);
            
        if (prod.getInv() >= 1) {
            prod.setInv(prod.getInv() - 1);
            productService.save(prod);
            return "buyproductconfirm";
        }
        else {
            return "buyproducterror";
        }
    }
}
