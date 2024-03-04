package com.groupeisi.impot.service;

import com.groupeisi.impot.entities.Declarant;

import java.util.List;
import java.util.Optional;

public interface IDeclarantService {
    Declarant save (Declarant declarant);
    Declarant update (Declarant declarant);
    Declarant get (long id);

    List<Declarant> getAll();
    Optional<Declarant> getDeclarant(Long id);

    Iterable<Declarant> getDeclarant();

    void delete(Long id);


}
