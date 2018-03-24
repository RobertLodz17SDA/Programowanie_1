package pl.sdacademy.todoapp;

public class ListaJadnokierunkowa {

    private Element first;

    public void add(Element e) {
        if (first == null) {
            first = e;
        } else {
            first.addNext(e);
        }
    }

    // zrobić toString !!!
    public String toString() {
        return this.first.toString();
    }

    // zrobić remove !!!

    public void remove(int index) {
        if (index == 0) {
            Element node = first.getNext();
            first.removeRef();
            first = node;
        } else {
            Element current = first;
            Element prev = null;
            for (int i = 0; i <= index; i++) {
             prev = current;
             current = current.getNext();
            }
            Element next = current.getNext();
            current.removeRef();
            prev.setNext(next);
        }
    }

    public String getElement(int index){
        Element currentElement = first;
        int iterationIndex = 0;
        while (iterationIndex < index){
            currentElement = currentElement.getNext();
            iterationIndex ++;
        }
        return currentElement.getText();
    }
}
