package com.groupeisi.impot.controller;

import com.groupeisi.impot.entities.Declarant;
import com.groupeisi.impot.entities.Declaration;
import com.groupeisi.impot.service.IDeclarationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/declaration")
@AllArgsConstructor

public class DeclarationController {
    @Autowired
    private IDeclarationService declarationService;
    @PostMapping("/declaration")
    public Declaration createDeclaration(@RequestBody Declaration declaration) {
        return declarationService.save(declaration);
    }

    @GetMapping("/declaration/{id}")
    public Declaration getDeclaration(@PathVariable("id") final Long id) {
        Optional<Declaration> declaration = declarationService.getDeclaration(id);
        if(declaration.isPresent()) {
            return declaration.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/declaration")
    public Iterable<Declaration> getDeclarations() {
        return declarationService.getDeclaration();
    }
    /**
     * Update - Update an existing employee
     * @param id - The id of the employee to update
     * @param declaration - The employee object updated
     * @return
     */
    @PutMapping("/declaration/{id}")
    public Declaration updateDeclaration(@PathVariable("id") final Long id, @RequestBody Declaration declaration) {
        Optional<Declaration> e = declarationService.getDeclaration(id);
        if(e.isPresent()) {
            Declaration currentDeclaration = e.get();

            Date datedec = declaration.getDatedec();
            if(datedec != null) {
                currentDeclaration.setDatedec(datedec);
            }
            Double montant = declaration.getMontant();
            if(montant != null) {
                currentDeclaration.setMontant(montant);
            }

            declarationService.save(currentDeclaration);
            return currentDeclaration;
        } else {
            return null;
        }
    }
    /**
     * Delete - Delete an employee
     * @param id - The id of the employee to delete
     */
    @DeleteMapping("/declaration/{id}")
    public void delete(@PathVariable("id") final Long id) {
        declarationService.delete(id);
    }

}
