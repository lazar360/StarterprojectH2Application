package com.mycompany.starterprojectH2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
public class DIUtilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    private String name;

    @ManyToMany
    @JoinTable(name ="di_diutilisateur")
    private Set<DI> DIs;
}
