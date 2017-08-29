package main.java.net.proselyte.javase.chapter10;

/**
 * @author Fominykh Vladimir
 */
public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
