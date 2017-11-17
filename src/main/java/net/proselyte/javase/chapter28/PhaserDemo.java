package main.java.net.proselyte.javase.chapter28;

import java.util.concurrent.Phaser;

/**
 * @author Fominykh Vladimir
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        // ожидать завершение всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");
        // ожидать завершение всеми потоками исполнения второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");
        // ожидать завершение всеми потоками исполнения третьей фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        if (phsr.isTerminated())
            System.out.println("Синхронизатор фаз завершен");
    }
}
