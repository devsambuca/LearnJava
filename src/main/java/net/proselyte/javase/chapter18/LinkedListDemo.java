package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */

// Продемонстрировать применение класса LinkedList
public class LinkedListDemo {
    public static void main(String[] args) {
        // Создать связный список
        LinkedList<String> ll = new LinkedList<String>();

        //Ввести элементы в связаный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного списка ll: " + ll);

        //удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного списка ll: " + "после удаления элементов " + ll);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка ll после удаления " + "первого и последнего элементов: " + ll);

        //получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое связаного списка ll после изменения " + ll);
    }
}
