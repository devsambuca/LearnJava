package main.java.net.proselyte.javase.chapter11;

/**
 * Created by smb on 21.11.2017.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");

        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
