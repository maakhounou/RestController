package com.groupeisi.impot.service;

import com.groupeisi.impot.entities.Declarant;
import com.groupeisi.impot.repository.DeclarantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DeclarantService implements IDeclarantService {
    private DeclarantRepository declarantRepository;
    @Override
    public Declarant save(Declarant declarant) {
        return null;
    }

    @Override
    public Declarant update(Declarant declarant) {
        return null;
    }



    @Override
    public Declarant get(long id) {
        return null;
    }

    @Override
    public List<Declarant> getAll() {
        return declarantRepository.findAll();
    }

    @Override
    public Optional<Declarant> getDeclarant(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Declarant> getDeclarant() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


}
