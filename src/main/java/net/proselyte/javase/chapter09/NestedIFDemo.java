package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
public class NestedIFDemo {
    public static void main(String[] args) {
        // использовать ссылку на влоденный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
