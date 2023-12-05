package com.example.ecomjsf.persistence;

import com.example.ecomjsf.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class ProductDAOImpl extends GenericDAOImpl<Product> implements ProductDAO {
    public ProductDAOImpl() {
        super(Product.class);
    }
}