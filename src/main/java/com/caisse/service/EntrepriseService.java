package com.caisse.service;

import com.caisse.dto.EntrepriseDto;

public interface EntrepriseService {
    EntrepriseDto save(EntrepriseDto dto);

    EntrepriseDto update(Integer id, EntrepriseDto updatedDto);

    //z  EntrepriseDto update (EntrepriseDto dto);
}
