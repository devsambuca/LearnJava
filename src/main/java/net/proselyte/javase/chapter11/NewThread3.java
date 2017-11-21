package main.java.net.proselyte.javase.chapter11;

/**
 * Created by smb on 21.11.2017.
 */
public class NewThread3 implements Runnable {
    String name; // имя потока исполнения
    Thread t;

    NewThread3(String threadName) {
        //  создать новый, второй поток исполнения
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток создан: " + t);
        t.start(); // запустить поток исполнения
    }
    // точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name +" прерван.");
        }
        System.out.println(name +" завершен.");
    }
}
