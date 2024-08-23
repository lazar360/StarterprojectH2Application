package com.mycompany.starterprojectH2.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= {"numeroMoteur","numeroChassis"})
@ToString(of= {"numeroMoteur","numeroChassis","numeroImmatriculation","dateMiseEnCirculation", "interventions"})
public class Vehicule implements Serializable
{
    // champs métier
    @Getter
    @Setter
    private String numeroMoteur;

    @Getter
    @Setter
    private String numeroChassis;

    @Getter
    @Setter
    private String numeroImmatriculation;

    @Getter
    @Setter
    private LocalDate dateMiseEnCirculation;

    // champs de relation
    @Getter
    @Singular
    List<String> interventions = new ArrayList<>();
}
