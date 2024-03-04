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
public class DeclarationServiceTest {
    @Autowired
    private IDeclarationService declarationService;

    @BeforeEach
    void setUp() {
        log.info("Demarrage du test");
    }
    @AfterEach
    void tearDown() {
        log.info("Fin de test");
    }
    @Test
    void save(){
        Declaration declaE = new Declaration();
        declaE.setId(1);
        declaE.setDatedec(java.sql.Date.valueOf("2023-08-20"));
        declaE.setMontant(Double.valueOf("200000"));


        Declaration declaS = declarationService.save(declaE);
        Assertions.assertEquals(declaS.getId(),declaE.getId());

    }
    @Test
    void update(){
        Declaration declaE = new Declaration();
        declaE.setId(1);
        declaE.setDatedec(java.sql.Date.valueOf("2023-08-20"));
        declaE.setMontant(Double.valueOf("200000"));

        declarationService.save(declaE);

        //faire une mise à jour
        Declaration declaM = new Declaration();
        declaM.setId(1);
        declaM.setDatedec(java.sql.Date.valueOf("2023-07-10"));
        declaM.setMontant(Double.valueOf("100000"));
        Declaration declaS = declarationService.update(declaE);
        Assertions.assertNotNull(declaS, "Déclaration modifiée");

        //afficher une erreur
        Declaration declaM2 = new Declaration();
        declaM2.setId(1);
        declaM2.setDatedec(java.sql.Date.valueOf("2023-07-10"));
        declaM2.setMontant(Double.valueOf("100000"));
        Declaration declaS2 = declarationService.update(declaE);
        Assertions.assertNotNull(declaS2, "Déclaration non trouvée");

    }
    @Test
    void remove() {

    }
    @Test
    void get(){
        Declaration decla = declarationService.get(1);
        Assertions.assertNull(decla);
    }
    @Test
    void getAll(){
        List<Declaration> decla =declarationService.getAll();
        Assertions.assertTrue(decla.size()==0);

    }


}
