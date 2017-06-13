package main.java.net.proselyte.javase.chapter04;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать нескольких операций с присваиваванием
 */
public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
