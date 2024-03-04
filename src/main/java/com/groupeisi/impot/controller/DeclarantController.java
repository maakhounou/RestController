package com.groupeisi.impot.controller;

import com.groupeisi.impot.entities.Declarant;
import com.groupeisi.impot.service.IDeclarantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/declarant")
@AllArgsConstructor
public class DeclarantController {
    @Autowired
    private IDeclarantService declarantService;

    @PostMapping("/declarant")
    public Declarant createDeclarant(@RequestBody Declarant declarant) {
        return declarantService.save(declarant);
    }

    @GetMapping("/declarant/{id}")
    public Declarant getDeclarant(@PathVariable("id") final Long id) {
        Optional<Declarant> declarant = declarantService.getDeclarant(id);
        if(declarant.isPresent()) {
            return declarant.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/declarant")
    public Iterable<Declarant> getDeclarants() {
        return declarantService.getDeclarant();
    }
    /**
     * Update - Update an existing employee
     * @param id - The id of the employee to update
     * @param declarant - The employee object updated
     * @return
     */
    @PutMapping("/declarant/{id}")
    public Declarant updateDeclarant(@PathVariable("id") final Long id, @RequestBody Declarant declarant) {
        Optional<Declarant> e = declarantService.getDeclarant(id);
        if(e.isPresent()) {
            Declarant currentDeclarant = e.get();

            String raison = declarant.getRaison();
            if(raison != null) {
                currentDeclarant.setRaison(raison);
            }
            String adresse = declarant.getAdresse();
            if(adresse != null) {
                currentDeclarant.setAdresse(adresse);
            }
            String email = declarant.getEmail();
            if(email != null) {
                currentDeclarant.setEmail(email);
            }
            String phone = declarant.getPhone();
                if(phone != null) {
                currentDeclarant.setPhone(phone);
            }

            declarantService.save(currentDeclarant);
            return currentDeclarant;
        } else {
            return null;
        }
    }
    /**
     * Delete - Delete an employee
     * @param id - The id of the employee to delete
     */
    @DeleteMapping("/declarant/{id}")
    public void delete(@PathVariable("id") final Long id) {
        declarantService.delete(id);
    }


}
