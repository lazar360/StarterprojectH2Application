package com.mycompany.starterprojectH2.bootstrap;

import com.mycompany.starterprojectH2.entity.Contact;
import com.mycompany.starterprojectH2.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired private ContactRepository repo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Create Contact");
        createContact();
        updateContact();

    }

    private void createContact(){

        Contact newContact = new Contact();
        newContact.setName("Peter Smith");
        newContact.setEmail("peter.smith@mail.com");
        newContact.setAddress("New York, USA");
        newContact.setPhone("123456-2111");

        repo.save(newContact);
        System.out.println("new contact was created");
    }

    private void updateContact() {
        Contact existContact = new Contact();

        existContact.setId(1);
        existContact.setName("Peter Smith");
        existContact.setEmail("peter.smith@gmail.com");
        existContact.setAddress("New York, USA");
        existContact.setPhone("123456-2111");

        Contact updatedContact = repo.update(existContact);
        System.out.println("exist contact was updated");

    }



}
