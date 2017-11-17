package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Phaser;

/**
 * @author Fominykh Vladimir
 */
public class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String s) {
        phsr = p;
        name = s;
        phsr.register();
        new Thread(this).start();
    }
    @Override
    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // ивестить о достижении фазы

        // Небольшая пауза, чтобы не нарушать порядок вывода.
        // Только для иллюстрации, но необязательно для првильного
        // функционирования синхронизатора фаз

        try {
            Thread.sleep(10);
        } catch (InterruptedException e ){
            System.out.println(e);
        }
        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // ивестить о достижении фазы

        // Небольшая пауза, чтобы не нарушать порядок вывода.
        // Только для иллюстрации, но необязательно для првильного
        // функционирования синхронизатора фаз

        try {
            Thread.sleep(10);
        } catch (InterruptedException e ){
            System.out.println(e);
        }
        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister(); // известить о достижении фазы и снять потоки с регистрации

    }
}
