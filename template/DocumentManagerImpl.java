package com.uniyaz.template;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;

public class DocumentManagerImpl extends DocumentManager {

    public void checkDocument(Document document) {
        System.out.println("Document checked...");
    }

    public Document  openDocument(String s) {
        System.out.println("Document " + s + " opened.");
        return new Pdf();
    }

    private class Pdf implements Document {
        public int getLength() {
            return 0;
        }

        public void addDocumentListener(DocumentListener listener) {

        }

        public void removeDocumentListener(DocumentListener listener) {

        }

        public void addUndoableEditListener(UndoableEditListener listener) {

        }

        public void removeUndoableEditListener(UndoableEditListener listener) {

        }

        public Object getProperty(Object key) {
            return null;
        }

        public void putProperty(Object key, Object value) {

        }

        public void remove(int offs, int len) throws BadLocationException {

        }

        public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {

        }

        public String getText(int offset, int length) throws BadLocationException {
            return null;
        }

        public void getText(int offset, int length, Segment txt) throws BadLocationException {

        }

        public Position getStartPosition() {
            return null;
        }

        public Position getEndPosition() {
            return null;
        }

        public Position createPosition(int offs) throws BadLocationException {
            return null;
        }

        public Element[] getRootElements() {
            return new Element[0];
        }

        public Element getDefaultRootElement() {
            return null;
        }

        public void render(Runnable r) {

        }
    }
}
