package com.caisse.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "stockup")

public class StockUp extends AbstractEntity {
    @Column(name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;

    @Column(name = "etatcommande")
    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    @Column(name = "identreprise")
    private Integer idEntreprise;

   // @ManyToOne

 /*   @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;*/

    @OneToMany(mappedBy = "stockUp")
    private List<LigneStockUp> lignestockUp;

}
