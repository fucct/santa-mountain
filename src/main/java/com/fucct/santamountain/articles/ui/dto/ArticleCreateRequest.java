package com.fucct.santamountain.articles.ui.dto;

import com.fucct.santamountain.articles.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ArticleCreateRequest {
    private String title;
    private String contents;

    public Article toArticle() {
        return Article.of(this.title, this.contents);
    }
}
