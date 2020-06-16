package com.company.ProxyPatter;

public class BookParser implements IBookParser{
    private String book;
    public BookParser(String book){
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        return book.length();
    }
}
