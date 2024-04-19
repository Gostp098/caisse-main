package com.caisse.service.IService;

import com.caisse.dto.ArticleDto;
import com.caisse.dto.LigneFactureDto;
import com.caisse.dto.LigneStockUpDto;
import com.caisse.service.ArticleService;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {


    @Override
    public ArticleDto save(ArticleDto dto) {
        return null;
    }

    @Override
    public ArticleDto findById(Integer id) {
        return null;
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return null;
    }

    @Override
    public List<LigneFactureDto> findHistoriqueVentes(Integer idArticle) {
        return null;
    }

    @Override
    public List<LigneStockUpDto> findHistoriqueStockUp(Integer idArticle) {
        return null;
    }

    @Override
    public List<ArticleDto> findAllArticleByIdCategory(Integer idCategory) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    public static class CategoryServiceImpl {
    }
}
