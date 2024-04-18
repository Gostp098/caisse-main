package com.caisse.dto;

import com.caisse.entity.LigneStockUp;
import com.caisse.entity.StockUp;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
public class LigneStockUpDto {
    private Integer id;

    private ArticleDto article;

    private StockUp stockUp;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;
    public static LigneStockUpDto fromEntity(LigneStockUp lignestockup) {
        if (lignestockup == null) {
            return null;
        }
        return LigneStockUpDto.builder()
                .id(lignestockup.getId())
                .article(ArticleDto.fromEntity(lignestockup.getArticle()))
                .quantite(lignestockup.getQuantite())
                .prixUnitaire(lignestockup.getPrixUnitaire())
                .idEntreprise(lignestockup.getIdEntreprise())
                .build();
    }

    public static LigneStockUp toEntity(LigneStockUpDto dto) {
        if (dto == null) {
            return null;
        }

        LigneStockUp ligneStockUp = new LigneStockUp();
        ligneStockUp.setId(dto.getId());
        ligneStockUp.setArticle(ArticleDto.toEntity(dto.getArticle()));
        ligneStockUp.setPrixUnitaire(dto.getPrixUnitaire());
        ligneStockUp.setQuantite(dto.getQuantite());
        ligneStockUp.setIdEntreprise(dto.getIdEntreprise());
        return ligneStockUp;
    }

}