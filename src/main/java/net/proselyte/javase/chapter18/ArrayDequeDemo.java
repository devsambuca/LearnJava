package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
         //создать двухстроннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        //использовать класс ArrayDeque для организации стека
        adq.add("A");
        adq.add("B");
        adq.add("D");
        adq.add("E");
        adq.add("F");

        System.out.print("Извлечение из стека: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
