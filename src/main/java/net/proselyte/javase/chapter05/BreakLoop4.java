package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Применение оператора break для выхода из влоденных циклов
 */
public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for ( int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; //выход из обоих цциклов
                System.out.print(j + " ");
            }
            System.out.println("Этот оператор не будет выполняться");
        }
        System.out.println("Циклы завершены.");
    }
}
