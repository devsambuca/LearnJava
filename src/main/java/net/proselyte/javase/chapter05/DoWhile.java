package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать применение оператора цикла do-while
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}



/*      do {
            System.out.println("такт " + n);
        } while (--n > 0);
*/