package com.caisse.controller;

import com.caisse.dto.ArticleDto;
import com.caisse.dto.LigneFactureDto;
import com.caisse.dto.LigneStockUpDto;
import com.caisse.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/article")
public class ArticleController {
/*
    @Autowired
    private ArticleService articleService;



    @PostMapping("/articles")
    // Assuming this is where you save articles


    public ArticleDto createArticle(@RequestBody ArticleDto articleDto) {
        return articleService.save(articleDto);
    }
    /*
    public ArticleDto save(@RequestBody ArticleDto dto) {
        return articleService.save(dto);
    *

    @GetMapping("/articles/{id}") // Endpoint to find article by ID
    public ArticleDto findById(@PathVariable Integer id) {
        return articleService.findById(id);
    }


    @GetMapping("/articles/code/{codeArticle}") // Endpoint to find article by code
    public ArticleDto findByCodeArticle(@PathVariable String codeArticle) {
        return articleService.findByCodeArticle(codeArticle);
    }


    @GetMapping("/articles") // Endpoint to retrieve all articles
    public List<ArticleDto> findAll() {
        return articleService.findAll();
    }

    @Override
    @GetMapping("/articles/{id}/ventes") // Endpoint to retrieve sales history for an article
    public List<LigneVenteDto> findHistoriqueVentes(@PathVariable Integer idArticle) {
        return articleService.findHistoriqueVentes(idArticle);
    }

    @Override
    @GetMapping("/articles/{id}/commandes-client") // Endpoint to retrieve client order history for an article
    public List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable Integer idArticle) {
        return articleService.findHistoriaueCommandeClient(idArticle);
    }




    @GetMapping("/articles/category/{idCategory}") // Endpoint to retrieve all articles by category ID
    public List<ArticleDto> findAllArticleByIdCategory(@PathVariable Integer idCategory) {
        return articleService.findAllArticleByIdCategory(idCategory);
    }


    @DeleteMapping("/articles/{id}") // Endpoint to delete an article by ID
    public void delete(@PathVariable Integer id) {
        articleService.delete(id);
    }
*/

}