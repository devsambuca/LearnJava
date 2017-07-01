package main.java.net.proselyte.javase.chapter09;

/**
 * @author Fominykh Vladimir
 */

// класс В реализует вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
