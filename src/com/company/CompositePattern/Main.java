package com.company.CompositePattern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n";
        TodoList list = Generate.generateAll();

        html +=list.getHTML();
        html +="\n" +
                "</body>\n" +
                "</html>";
        try {
            writeToFile(html);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    static public void writeToFile(String str)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        writer.write(str);

        writer.close();
    }
}
