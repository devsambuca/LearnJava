package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Fominykh Vladimir
 */
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );

        System.out.println("Запуск потоков");

        new MyThread2(cb, "A");
        new MyThread2(cb, "B");
        new MyThread2(cb, "C");
        new MyThread2(cb, "X");
        new MyThread2(cb, "Y");
        new MyThread2(cb, "Z");
    }
}
