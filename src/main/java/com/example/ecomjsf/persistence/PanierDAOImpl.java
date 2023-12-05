package com.example.ecomjsf.persistence;

import com.example.ecomjsf.entities.Panier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class PanierDAOImpl extends GenericDAOImpl<Panier> implements PanierDAO {
    public PanierDAOImpl() {
        super(Panier.class);
    }
}