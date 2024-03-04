package com.groupeisi.impot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="Declaration")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Declaration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date datedec;
    @Column(name = "Montant ")
    private Double montant;
    @ManyToOne
    private Declarant declarant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatedec() {
        return datedec;
    }

    public void setDatedec(Date datedec) {
        this.datedec = datedec;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }



}
