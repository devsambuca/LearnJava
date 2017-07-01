package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
