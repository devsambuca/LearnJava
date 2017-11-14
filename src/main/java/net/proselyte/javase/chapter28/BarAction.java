package main.java.net.proselyte.javase.chapter28;

/**
 * @author Fominykh Vladimir
 */
public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
