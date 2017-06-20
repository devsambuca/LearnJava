package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 *
 * Простой пример рекурсии
 */
public class Factorial {
    // это рекурсивный метод
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
