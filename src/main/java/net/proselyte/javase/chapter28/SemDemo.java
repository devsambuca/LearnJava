package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Semaphore;

/**
 * @author Fominykh Vladimir
 */
public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
