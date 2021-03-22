package com.fucct.santamountain.articles.application;

import org.springframework.stereotype.Service;

import com.fucct.santamountain.articles.domain.Article;
import com.fucct.santamountain.articles.domain.ArticleRepository;
import com.fucct.santamountain.articles.ui.dto.ArticleCreateRequest;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Mono<Void> save(Mono<ArticleCreateRequest> request) {
        return request.map(ArticleCreateRequest::toArticle)
            .flatMap(articleRepository::save)
            .then();
    }

    public Flux<Article> findAll() {
        return articleRepository.findAll()
            .log();
    }

    public Mono<Article> findById(String id) {
        return articleRepository.findById(id);
    }
}
