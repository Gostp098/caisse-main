package com.caisse.service.IService;

import ch.qos.logback.classic.Logger;
import com.caisse.dto.EntrepriseDto;
import com.caisse.exception.EntityNotFoundException;
import com.caisse.exception.ErrorCodes;
import com.caisse.exception.InvalidEntityException;
import com.caisse.repository.EntrepriseRepository;
import com.caisse.service.EntrepriseService;
import com.caisse.validator.EntrepriseValidator;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional(rollbackOn = Exception.class)
@Service
@Slf4j
public class EntrepriseServiceImpl implements EntrepriseService {


    private EntrepriseRepository entrepriseRepository;


    @Autowired
    public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public EntrepriseDto save(EntrepriseDto dto) {
        List<String> errors = EntrepriseValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Entreprise is not valid {}", dto);
            throw new InvalidEntityException("L'entreprise n'est pas valide", ErrorCodes.ENTREPRISE_NOT_VALID, errors);
        }
        EntrepriseDto savedEntreprise = EntrepriseDto.fromEntity(
                entrepriseRepository.save(EntrepriseDto.toEntity(dto))
        );
        return  savedEntreprise;
    }
/*
    @Override
    public EntrepriseDto update(Integer id, EntrepriseDto updatedDto) {
        EntrepriseDto existingEntreprise = EntrepriseDto.findById(id).get();
        // Validate the updated entity
        List<String> errors = EntrepriseValidator.validate(EntrepriseDto.fromEntity(existingEntreprise));
        if (!errors.isEmpty()) {
            log.error("Updated entreprise is not valid {}", updatedDto);
            throw new InvalidEntityException("L'entreprise mise à jour n'est pas valide", ErrorCodes.ENTREPRISE_NOT_VALID, errors);
        }
        // Save the updated entity
        EntrepriseDto updatedEntreprise = entrepriseRepository.save(existingEntreprise);
        return EntrepriseDto.fromEntity(updatedEntreprise);
    }
*/

}