package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Semaphore;

/**
 * Created by smb on 13.11.2017.
 */
public class Q {
    int n;

    // начать с недоступного семафора потребителя
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InteruptedException");
        }
        System.out.println("Получено: " + n);
        semProd.release();
    }
    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InteruptedException");
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        semCon.release();
    }
}
