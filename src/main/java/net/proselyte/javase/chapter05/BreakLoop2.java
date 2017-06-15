package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Применение оператора break для вызода из цикла while
 */
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 10) break; // выход из циклаб если значение
                                // переменной i равно 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
