package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */
abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
// Любой класс, наследующий от класса Incomplete, должен
// реализовывать метод callback() или быть также
// объявлен как abstract.
