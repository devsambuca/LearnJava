package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать срок действия петеменной
 */
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //переменная y инициализируется при
            // каждом вхождении в блок
            System.out.println(" y равно: " + y);

            y = 100;
            System.out.println(" y теперь равно: " + y);
        }
    }
}
