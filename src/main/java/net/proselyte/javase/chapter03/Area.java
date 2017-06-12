package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * Вычислить площадь круга
 */
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8;       // радиус окружностм
        pi = 3.1416;    // приблизительное значение числа пи
        a = pi * r * r; // вычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
