package com.uniyaz.template;

import javax.swing.text.Document;

public abstract class DocumentManager {

    /**
     * Bir dökümanı edinme algoritmasini getDocument()
     * metodunda tanımlıyoruz.
     * Bir dökümanı elde edebilmek için önce o
     * dökümanın açılması (openDocument)
     * ve checkDocument() ile kontrol edilmesi
     * gerekiyor. Bu işlemler ardından
     * döküman temin edilir.
     *
     */
    public final Document getDocument(String name) {
        Document dokument = openDocument(name);
        checkDocument(dokument);
        return dokument;
    }

    /**
     * Altsınıflar tarafından istekleri
     * dogrultusunda implemente edilir.
     *
     */
    public abstract void checkDocument(Document document);

    /**
     * Altsınıflar tarafından istekleri
     * dogrultusunda implemente edilir.
     *
     * @param s
     * Document ismi
     * @return Document Document
     */
    public abstract Document openDocument(String s);

}
