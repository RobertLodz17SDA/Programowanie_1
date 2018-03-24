package pl.sdacademy.todoapp;

public class Element <T> {

    private Element <T> next;
    private String text;

    Element(String text) {
        this.text = text;
    }

    public void addNext(Element e) {
        if (next == null) {
            next = e;
        } else {
            next.addNext(e);
        }
    }

    public void removeRef() {
        next = null;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public String toString() {
        if (next != null) {
            return text + " " + String.valueOf(next);
        } else {
            return text;
        }
    }

    public Element getNext() {
        return next;
    }

    public String getText(){
        return this.text;
    }
}

