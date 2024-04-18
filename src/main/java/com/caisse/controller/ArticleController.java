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
@RequestMapping("/articles")
public class ArticleController {
/*
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public ResponseEntity<ArticleDto> saveArticle(@RequestBody ArticleDto articleDto) {
        ArticleDto savedArticle = articleService.save(articleDto);
        return new ResponseEntity<>(savedArticle, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticleById(@PathVariable Integer id) {
        ArticleDto articleDto = articleService.findById(id);
        return ResponseEntity.ok(articleDto);
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<ArticleDto> getArticleByCode(@PathVariable String code) {
        ArticleDto articleDto = articleService.findByCodeArticle(code);
        return ResponseEntity.ok(articleDto);
    }

    @GetMapping
    public ResponseEntity<List<ArticleDto>> getAllArticles() {
        List<ArticleDto> articles = articleService.findAll();
        return ResponseEntity.ok(articles);
    }

   */ // Add other endpoints for your service methods here, e.g., findHistoriqueVentes, findHistoriqueStockUp, etc.
}
