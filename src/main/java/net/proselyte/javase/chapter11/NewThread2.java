package main.java.net.proselyte.javase.chapter11;

/**
 * Создать второй поток исполнения, расширив класс Thread
 *
 * Created by smb on 21.11.2017.
 */
public class NewThread2 extends Thread {
    NewThread2() {
        //  создать новый исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток исполнения
    }
    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

