package com.company.CompositePattern;

public class ToDo implements TodoList{
    private String title;

    public ToDo(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getHTML() {
        String html = title;
        return html;
    }
}
