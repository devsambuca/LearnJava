package main.java.net.proselyte.javase.chapter02;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать исходному файлу имя "ForTest.java"
 */
public class ForTest {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x = x + 1)
            System.out.println("Значение x: " + x);
    }
}
