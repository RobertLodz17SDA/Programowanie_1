package pl.sdacademy.todoapp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJadnokierunkowa lista = new ListaJadnokierunkowa();
        int index = 2;

        lista.add("Jan");
        lista.add("Adam");
        lista.add("Aleksander");
        lista.add("Jakub");
        lista.add("Zenon");
        lista.add("Ewa");
        lista.add("Małgosia");
        lista.add("Agnieszka");

        System.out.println(lista);
        System.out.println("--------------");
        System.out.println(lista);
        index = 5;
        lista.remove(index);
        System.out.println("Removed element Nr "+ index);
        System.out.println(lista);
        System.out.println("--------------");
        System.out.println("Element nr " + index + " jest równy " + lista.getElement(index));
        index = 2;
        System.out.println("Element nr " + index + " jest równy " + lista.getElement(index));
    }
}
