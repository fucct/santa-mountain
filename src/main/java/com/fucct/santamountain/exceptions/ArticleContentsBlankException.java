package com.fucct.santamountain.exceptions;

public class ArticleContentsBlankException extends BadRequestException {
    public ArticleContentsBlankException(String message) {
        super(message);
    }
}
