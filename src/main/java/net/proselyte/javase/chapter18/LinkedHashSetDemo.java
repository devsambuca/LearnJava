package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */

// Продемонстрировать примениение класса LinkedHashSet
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");

        System.out.println(lhs);

        // после этого выводимый результат будет отражая тот порядок в каком элементы были введены в хеш-множество
    }
}

