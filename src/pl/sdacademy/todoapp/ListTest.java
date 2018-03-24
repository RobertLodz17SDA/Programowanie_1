package pl.sdacademy.todoapp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJadnokierunkowa lista = new ListaJadnokierunkowa();
        int index = 2;

        lista.add(new Element("Jan"));
        lista.add(new Element("Adam"));
        lista.add(new Element("Aleksander"));
        lista.add(new Element("Jakub"));
        lista.add(new Element("Zenon"));
        lista.add(new Element("Ewa"));
        lista.add(new Element("Małgosia"));
        lista.add(new Element("Agnieszka"));

        System.out.println(lista);
        System.out.println("--------------");
        System.out.println(lista);
        lista.remove(index);
        System.out.println("Removed "+ index + " element.");
        System.out.println(lista);
        System.out.println("--------------");
        System.out.println("Element nr " + index + " jest równy " + lista.getElement(index));
        index = 0;
        System.out.println("Element nr " + index + " jest równy " + lista.getElement(index));
    }
}
