package com.example.ecomjsf.beans;

import com.example.ecomjsf.entities.Product;
import com.example.ecomjsf.persistence.ProductDAO;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ProductBean {

    @Inject
    private ProductDAO productService;

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = productService.findAll();
    }

    public List<Product> getProducts() {
        return products;
    }

    public String goToCommande() {
        return "goToCommande";
    }

}
