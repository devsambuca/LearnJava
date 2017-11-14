package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 * @author Fominykh Vladimir
 */
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");
        new MyThread(cd1);

        try {
            cd1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Завершение потока исполнения");
    }
}
