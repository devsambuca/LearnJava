package main.java.net.proselyte.javase.chapter11;

/**
 * Created by smb on 21.11.2017.
 */
public class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
    }

