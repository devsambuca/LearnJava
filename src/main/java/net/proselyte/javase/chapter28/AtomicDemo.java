package main.java.net.proselyte.javase.chapter28;

/**
 * Created by smb on 21.11.2017.
 *
 * Простой пример выполнения атомарных операций
 */
public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
