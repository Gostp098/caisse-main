package com.caisse.controller;

import com.caisse.dto.EntrepriseDto;
import com.caisse.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@CrossOrigin("*")
@RequestMapping("/Entreprise")
public class EntrepriseController {

    private  EntrepriseService entrepriseService;

    @Autowired
public EntrepriseController (EntrepriseService entrepriseService){
    this.entrepriseService =entrepriseService ;
}

    @PostMapping("/add")
    public EntrepriseDto save(@RequestBody EntrepriseDto dto)
    {return entrepriseService.save(dto) ;}



    @PutMapping("/put")
    public ResponseEntity<EntrepriseDto> Update(@RequestBody EntrepriseDto dto) {

            return entrepriseService.Update(dto);
        }

}
