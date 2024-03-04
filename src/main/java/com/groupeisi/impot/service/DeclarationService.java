package com.groupeisi.impot.service;

import com.groupeisi.impot.entities.Declaration;
import com.groupeisi.impot.repository.DeclarationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DeclarationService implements IDeclarationService {
    private DeclarationRepository declarationRepository;

    @Override
    public Declaration save(Declaration declaration) {return null;}

    @Override
    public Declaration update( Declaration declaration) {return null;}

    @Override
    public Declaration get(long id) {
        return null;
    }

    @Override
    public List<Declaration> getAll() {
        return declarationRepository.findAll();
    }

    @Override
    public Optional<Declaration> getDeclaration(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Iterable<Declaration> getDeclaration() {
        return null;
    }


}
