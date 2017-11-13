package main.java.net.proselyte.javase.chapter28;

/**
 * Created by smb on 13.11.2017.
 */
public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
