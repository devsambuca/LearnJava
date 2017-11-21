package main.java.net.proselyte.javase.chapter28;

/**
 * Created by smb on 21.11.2017.
 */
public class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Запуск потока " + name);
        for (int i = 1; i <= 3; i++)
            System.out.println("Поток " + name + " получено: " + Shared2.ai.getAndSet(i));
    }
}
