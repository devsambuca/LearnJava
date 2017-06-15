package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать применение оператора return
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if(t) return; // возврат в вызывающий код

        System.out.println("Этот оператор выполняется не будет.");
    }
}
