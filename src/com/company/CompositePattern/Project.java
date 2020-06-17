package com.company.CompositePattern;

import java.util.ArrayList;

public class Project implements TodoList{
    private String title;
    private ArrayList<TodoList> list;
    public Project(String title, ArrayList<TodoList> list){
        this.title = title;
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<TodoList> getList() {
        return list;
    }

    public void setList(ArrayList<TodoList> list) {
        this.list = list;
    }

    @Override
    public String getHTML() {
        String html = "<h1>"+title+"</h1>\n";
        html+="<ul>\n";
        for (TodoList element: list) {
            html+="<li>";
            html+=element.getHTML();
            html+="</li>\n";
        }
        html+="</ul>\n";
        return html;
    }
}
