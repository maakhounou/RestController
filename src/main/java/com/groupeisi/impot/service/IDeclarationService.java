package com.groupeisi.impot.service;

import com.groupeisi.impot.entities.Declaration;

import java.util.List;
import java.util.Optional;


public interface IDeclarationService {
    Declaration save (Declaration declaration);
    Declaration update (Declaration declaration);
    Declaration get (long id);
    List<Declaration> getAll();

    Optional<Declaration> getDeclaration(Long id);

    void delete(Long id);

    Iterable<Declaration> getDeclaration();
}
