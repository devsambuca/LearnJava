package main.java.net.proselyte.javase.chapter05;

/**
 * @author Fominykh Vladimir
 *
 * Поиск в массиве с применением цикла for в стиле for each
 */
public class Search {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 3, 5, 6, 1, 4 };
        int val = 1;
        boolean found = false;

        // использовать цикл for в стиле for each для
        // поиска значения переменной val в массиве nums
        for (int x : nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}
