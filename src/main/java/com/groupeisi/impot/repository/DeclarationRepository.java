package com.groupeisi.impot.repository;

import com.groupeisi.impot.entities.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration,Long> {
   // Declaration findById(long id);
}
