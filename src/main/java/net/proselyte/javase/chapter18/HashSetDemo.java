package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */

// Продемонстрировать применение класса HashSet
public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<String>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);

    }

}
