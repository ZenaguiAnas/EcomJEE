package com.example.ecomjsf.persistence;

import com.example.ecomjsf.entities.Commande;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class CommandeDAOImpl extends GenericDAOImpl<Commande> implements CommandeDAO {
    public CommandeDAOImpl() {
        super(Commande.class);
    }
}