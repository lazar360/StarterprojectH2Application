package com.mycompany.starterprojectH2.bootstrap;

import com.mycompany.starterprojectH2.entity.Contact;
import com.mycompany.starterprojectH2.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired private ContactRepository repo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Create Contact");
        createContact();
        updateContact();
        listContacts();
        getContact();

    }

    private void createContact(){

        Contact newContact1 = new Contact();
        newContact1.setName("Peter Smith");
        newContact1.setEmail("peter.smith@mail.com");
        newContact1.setAddress("New York, USA");
        newContact1.setPhone("123456-2111");

        Contact newContact2 = new Contact();
        newContact2.setName("John Do");
        newContact2.setEmail("john.do@mail.com");
        newContact2.setAddress("Paris, France");
        newContact2.setPhone("00000000");

        Contact newContact3 = new Contact();
        newContact3.setName("Peter Jackson");
        newContact3.setEmail("peter.jackson@mail.com");
        newContact3.setAddress("Berlin, Germany");
        newContact3.setPhone("123456-2111");

        repo.save(newContact1);
        repo.save(newContact2);
        repo.save(newContact3);
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

    private void listContacts() {
        List<Contact> listContacts = repo.findAll();
        listContacts.forEach(System.out::println);
    }

    private void getContact() {
        Integer contactId = 1;
        Contact contact = repo.findById(contactId);

        System.out.println(contact);
    }

}
