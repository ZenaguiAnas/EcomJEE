package com.example.ecomjsf.persistence;

import com.example.ecomjsf.entities.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class ClientDAOImpl extends GenericDAOImpl<Client> implements ClientDAO {
    public ClientDAOImpl() {
        super(Client.class);
    }
}