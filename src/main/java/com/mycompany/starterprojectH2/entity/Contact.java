package com.mycompany.starterprojectH2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer id;

    private String name;
    private String email;
    private String address;
    private String phone;

    public Contact(){

    }

}
