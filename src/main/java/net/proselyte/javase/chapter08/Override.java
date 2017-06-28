package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */
public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // здесь вызывается метод show() из класса B
    }
}
