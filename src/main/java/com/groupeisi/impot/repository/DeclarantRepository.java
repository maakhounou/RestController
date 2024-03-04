package com.groupeisi.impot.repository;

import com.groupeisi.impot.entities.Declarant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarantRepository extends JpaRepository<Declarant,Long> {
    //Declarant FindById(long id);
}
