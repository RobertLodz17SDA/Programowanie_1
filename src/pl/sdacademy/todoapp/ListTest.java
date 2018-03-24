package pl.sdacademy.todoapp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJadnokierunkowa lista = new ListaJadnokierunkowa();

        Element element = new Element("Jan");
        Element element1 = new Element("Adam");
        Element element2 = new Element("Aleksander");
        Element element3 = new Element("Jakub");

        lista.add(element);
        lista.add(element1);
        lista.add(element2);
        lista.add(element3);



        System.out.println(lista);

        lista.remove(2);

        System.out.println(lista);

        System.out.println("--------------");
        //przykład z implementacją listy która jest
        //zdefiniowana w javie
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Jan");
        linkedList.add("Adam");
        linkedList.add("Aleksander");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
