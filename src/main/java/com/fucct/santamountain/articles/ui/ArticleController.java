package com.fucct.santamountain.articles.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fucct.santamountain.articles.application.ArticleService;
import com.fucct.santamountain.articles.domain.Article;
import com.fucct.santamountain.articles.ui.dto.ArticleCreateRequest;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public Flux<Article> get() {
        return articleService.findAll();
    }

    @PostMapping
    public Mono<Void> create(@RequestBody Mono<ArticleCreateRequest> request) {
        return articleService.save(request);
    }

    @GetMapping("/{id}")
    public Mono<Article> getArticle(@PathVariable String id) {
        return articleService.findById(id);
    }

}
