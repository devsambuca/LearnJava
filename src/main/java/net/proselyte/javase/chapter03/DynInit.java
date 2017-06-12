package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * В этом примере демонстрируется динамическая инициализация
 */
public class DynInit {
    public static void main(String[] args) {

        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной с

        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
