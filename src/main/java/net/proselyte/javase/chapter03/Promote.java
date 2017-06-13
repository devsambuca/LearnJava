package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * Демонстрируется продвижение типа одного из операндов
 * для соответствия типу второго операнда в каждом
 * операторе с двумя операндами
 */
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
