package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
public class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе MyIF
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
