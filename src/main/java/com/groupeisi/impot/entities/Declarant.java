package com.groupeisi.impot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="Declarant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Declarant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Raison")
    private String raison;
    @Column(name = "Localité")
    private String adresse;
    @Column(name = "Email")
    private String email;
    @Column(name = "Telephone")
    private String phone;
    @OneToMany(mappedBy = "declarant")
    private List<Declaration> declaration;




}
