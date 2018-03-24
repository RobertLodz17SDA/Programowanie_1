package pl.sdacademy.todoapp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJadnokierunkowa<Integer> lista = new ListaJadnokierunkowa();
        int index = 2;

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);

        System.out.println(lista);
        System.out.println("--------------");
        System.out.println(lista);
        index = 2;
        lista.remove(index);
        System.out.println("Usunięty element Nr "+ index);
        System.out.println(lista);
        System.out.println("--------------");
        index = 5;
        System.out.println("Element nr " + index + " jest równy " + String.valueOf(lista.getElement(index)));
        index = 2;
        System.out.println("Element nr " + index + " jest równy " + String.valueOf(lista.getElement(index)));
    }
}
