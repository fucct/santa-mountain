package com.fucct.santamountain.articles.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ArticleRepository extends ReactiveMongoRepository<Article, String> {
}
