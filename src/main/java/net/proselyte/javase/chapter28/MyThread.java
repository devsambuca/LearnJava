package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 * @author Fominykh Vladimir
 */
public class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }
    @Override
    public void run() {
        for (int i = 0; i<5; i++) {
            System.out.println(i);
            latch.countDown(); // обратный отсчет
        }

    }
}
