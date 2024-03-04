package com.groupeisi.impot.service;

import com.groupeisi.impot.entities.Declarant;
import com.groupeisi.impot.entities.Declaration;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeclarantServiceTest {
    @Autowired
    private IDeclarantService declarantService;
    List<Declaration> Id_decla;


    @BeforeEach
    void setUp() {
        log.info("Demarrage du test");
    }
    @AfterEach
    void tearDown() {
        log.info("Fin de test");
    }

    @Test
    void save() {
        Declarant decEntree = new Declarant();
        decEntree.setId(1);
        decEntree.setRaison("Constructeur Automobile");
        decEntree.setAdresse("Plateau");
        decEntree.setEmail("maakhou@gmail.com");
        decEntree.setPhone("777935230");
        decEntree.setDeclaration(Id_decla);

        Declarant decSortie = declarantService.save(decEntree);
        Assertions.assertEquals(decSortie.getId(),decEntree.getId());
    }
    @Test
    void update(){
        Declarant decEntree = new Declarant();
        decEntree.setId(1);
        decEntree.setRaison("Constructeur Automobile");
        decEntree.setAdresse("Plateau");
        decEntree.setEmail("maakhou@gmail.com");
        decEntree.setPhone("777935230");
        decEntree.setDeclaration(Id_decla);

        declarantService.save(decEntree);

        //pour la modification
        Declarant decmodif = new Declarant();
        decmodif.setId(1);
        decmodif.setRaison("Parking Automobile");
        decmodif.setAdresse("Sacré-coeur");
        decmodif.setEmail("mum@gmail.com");
        decmodif.setPhone("776029515");
        decmodif.setDeclaration(Id_decla);

        Declarant decSortie = declarantService.update(decEntree);
        Assertions.assertNotNull(decSortie, "Déclarant modifié");
    }
    @Test
    void remove() {

    }
    @Test
    void get() {
        Declarant dec = declarantService.get(1);
        Assertions.assertNull(dec);
    }
    @Test
    void getAll(){
        List<Declarant> dec = declarantService.getAll();
        Assertions.assertTrue(dec.size()==0);
    }
}
