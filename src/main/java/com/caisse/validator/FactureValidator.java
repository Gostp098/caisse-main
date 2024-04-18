package com.caisse.validator;

import com.caisse.dto.FactureDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FactureValidator {
    public static List<String> validate(FactureDto dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("Veuillez renseigner le code de la commande");
            errors.add("Veuillez renseigner la date de la commande");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getCode())) {
            errors.add("Veuillez renseigner le code de la commande");
        }
        if (dto.getDateVente() == null) {
            errors.add("Veuillez renseigner la date de la commande");
        }

        return errors;
    }

}