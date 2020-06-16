package com.company.ProxyPatter;

public class BookParserProxy implements IBookParser{
    BookParser bookParser = null;
    String book;

    public BookParserProxy(String book){
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (bookParser == null) bookParser = new BookParser(this.book);
        return bookParser.getNumberOfPages();
    }
}
