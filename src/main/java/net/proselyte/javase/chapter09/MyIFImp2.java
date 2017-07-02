package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
public class MyIFImp2 implements MyIF {
    // В этом классе предоставляется реализация обоих методов
    // getNumber() и getString()
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другая строка.";
    }

}
