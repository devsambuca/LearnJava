package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
public class Client implements Callback {
    //реализовать интерфейс Callback
    public void callback(int p ) {

        System.out.println("Метод callback(), вызывается со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " + "могут определяться и другие члены.");
}



////реализовать интерфейс Callback
//    public void callback(int p ) {
//
//        System.out.println("Метод callback(), вызывается со значением " + p);
//    }
}
