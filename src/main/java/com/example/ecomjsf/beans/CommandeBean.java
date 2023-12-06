package com.example.ecomjsf.beans;

import com.example.ecomjsf.entities.Commande;
import com.example.ecomjsf.entities.Product;
import com.example.ecomjsf.persistence.CommandeDAO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class CommandeBean {

    @Inject
    private CommandeDAO commandeService;
    @Inject
    private PanierBean panierBean;

    private String clientName;

    public String makeCommande() {
        List<Product> panierProducts = panierBean.getProductsInPanier();


//        Commande newCommande = commandeService.save(clientName, panierProducts);

        panierBean.clearPanier();

        return "commandeSuccess";
    }

}
