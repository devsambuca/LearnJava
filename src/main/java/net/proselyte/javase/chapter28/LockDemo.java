package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Простой пример блокировки
 *
 * Created by smb on 22.11.2017.
 */
public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}
