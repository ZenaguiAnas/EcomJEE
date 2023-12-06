package com.example.ecomjsf.beans;

import com.example.ecomjsf.entities.Product;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class PanierBean implements Serializable {

    private List<Product> productsInPanier;

    @PostConstruct
    public void init() {
        productsInPanier = new ArrayList<>();
    }

    public List<Product> getProductsInPanier() {
        return productsInPanier;
    }

    // Method to add a product to the panier
    public void addToPanier(Product product) {
        productsInPanier.add(product);
    }

    // Method to remove a product from the panier
    public void removeFromPanier(Product product) {
        productsInPanier.remove(product);
    }

    // Method to clear the panier
    public void clearPanier() {
        productsInPanier.clear();
    }

}

