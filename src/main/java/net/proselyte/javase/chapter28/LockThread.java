package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by smb on 22.11.2017.
 */
public class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока" + name);

        try {
            // сначала заблокировать счетчик
            System.out.println("Поток" + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток" + name + " блокирует счетчик");
            Shared.count++;
            System.out.println("Поток" + name + ": " + Shared.count);
            // а теперь переключение контекста, если это возможно
            System.out.println("Поток" + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            //снять блокировку
            System.out.println("Поток" + name + " разблокирует счетчик");
            lock.unlock();
        }
    }

}
