package main.java.net.proselyte.javase.chapter04;

/**
 * @author Fominykh Vladimir
 *
 * Создает несколько целочисленных переменных, а затем
 * использует составные побитовые операторы с присваиванием
 * для манпулирования этими переменными
 */
public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);



    }
}
