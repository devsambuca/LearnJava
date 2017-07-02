package main.java.net.proselyte.javase.chapter09;

import javax.swing.*;

/**
 * @author Fominykh Vladimir
 */
public interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию.
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
