package main.java.net.proselyte.javase.chapter10;

/**
 * @author Fominykh Vladimir
 *
 * В этой программе создается специальный тип исключения
 */
public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}
