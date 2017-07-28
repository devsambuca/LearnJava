package main.java.net.proselyte.javase.chapter18;

import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class CompDemo {
    public static void main(String[] args) {
        // Создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();

    }
}
