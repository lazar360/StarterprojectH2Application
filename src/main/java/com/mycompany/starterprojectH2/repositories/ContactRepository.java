package com.mycompany.starterprojectH2.repositories;

import com.mycompany.starterprojectH2.entity.Contact;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void save(Contact contact) {
        entityManager.persist(contact);
    }

    @Transactional
    public Contact update(Contact contact) {
        return entityManager.merge(contact);
    }
}
