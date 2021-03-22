package com.fucct.santamountain.articles.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

import com.fucct.santamountain.exceptions.ArticleContentsBlankException;
import com.fucct.santamountain.exceptions.ArticleTitleBlankException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Document(collection = "articles")
public class Article {

    @Id
    private String id;

    private String title;

    private String contents;

    public Article(String id, String title, String contents) {
        if (title == null || title.isEmpty()) {
            throw new ArticleTitleBlankException("Article title is null");
        }

        if (contents == null || contents.isEmpty()) {
            throw new ArticleContentsBlankException("Article contents is null");
        }

        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    public static Article of(String title, String contents) {
        return new Article(null, title, contents);
    }
}
