package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать применение оператора цикла while
 */
public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }

}
