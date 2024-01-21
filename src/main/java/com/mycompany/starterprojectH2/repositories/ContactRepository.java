package com.mycompany.starterprojectH2.repositories;

import com.mycompany.starterprojectH2.entity.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Contact> findAll() {
        String jpql = "SELECT c FROM Contact c";
        TypedQuery<Contact> query = entityManager.createQuery(jpql, Contact.class);

        return query.getResultList();
    }

    public Contact findById(Integer id) {
        return entityManager.find(Contact.class, id);
    }

    public Contact findByEmail(String email){

        TypedQuery<Contact> query = entityManager.createQuery(
                "SELECT c FROM Contact c WHERE c.email = ?1", Contact.class);

        return query.setParameter(1, email).getSingleResult();

    }

    public List<String> findAllByAddress(String address){

        TypedQuery<Contact> query = entityManager.createQuery(
                "SELECT c FROM Contact c WHERE c.address = ?1", Contact.class);

        List<Contact> contacts = query.setParameter(1, address).getResultList();

        return contacts.stream()
                .map(Contact::getName)
                .collect(Collectors.toList());
    }


}
