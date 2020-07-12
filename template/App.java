package com.uniyaz.template;

import javax.swing.text.Document;

public class App {
    public static void main(String[] args) {
        DocumentManager manager = new DocumentManagerImpl();
        Document document = manager.getDocument("app_dok");

    }
}
