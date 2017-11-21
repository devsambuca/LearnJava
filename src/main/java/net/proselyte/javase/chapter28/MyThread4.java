package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 * Created by smb on 21.11.2017.
 */
public class MyThread4 implements Runnable {
    String name;
    CountDownLatch latch;

    MyThread4(CountDownLatch c, String n) {
        latch = c;
        name = n;
        new Thread(this);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
