package com.mycompany.starterprojectH2.bootstrap;

import com.mycompany.starterprojectH2.entity.DIUtilisateur;
import com.mycompany.starterprojectH2.repositories.DIUtilisateurRepository;
import com.mycompany.starterprojectH2.repositories.DiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;


@Component
public class BootStrapData implements CommandLineRunner {

    private final DiRepository diRepository;
    private final DIUtilisateurRepository diUtilisateurRepository;

    public BootStrapData(DiRepository diRepository, DIUtilisateurRepository diUtilisateurRepository) {
        this.diRepository = diRepository;
        this.diUtilisateurRepository = diUtilisateurRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*DIUtilisateur user1 = new DIUtilisateur();
        user1.setName("testUser1");
        DIUtilisateur user2 = new DIUtilisateur();
        user2.setName("testUser2");
        HashSet<DIUtilisateur> diUtilisateurSet = new HashSet<>();
        diUtilisateurSet.add(user1);

        DI diTest1 = new DI();
        diTest1.setReferenceDI("DI200007");
        diTest1.setComment("test1");

        DI diTest2 = new DI();
        diTest2.setReferenceDI("DI200008");
        diTest2.setComment("test2");

        diUtilisateurRepository.save(user1);
        diUtilisateurRepository.save(user2);
        diRepository.save(diTest1);
        diRepository.save(diTest2);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Dis : " + diRepository.count());*/

    }

}
