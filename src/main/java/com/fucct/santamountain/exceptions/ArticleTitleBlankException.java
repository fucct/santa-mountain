package com.fucct.santamountain.exceptions;

public class ArticleTitleBlankException extends BadRequestException {
    public ArticleTitleBlankException(String message) {
        super(message);
    }
}
