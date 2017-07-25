package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */

// Продемонстрировать простое применение интерфейса SplitIterator
public class SplitIteratorDemo {
    public static void main(String[] args) {
        //Создать списочный массив числовых значений типа double
        ArrayList<Double> vals = new ArrayList<Double>();

        //Ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        //вызвать метод tryAdvance() для вывода содержимого
        // списочного массива vals
        System.out.print("Содержимое списочного массива vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //Создать новый списочный массив, содержащий квадратные
        //корни числовых значений из списочного массива vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<Double>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        //Вызвать метод forEachRemaining() для вывода содержимого
        //списочного массива sqrs
        System.out.print("Содержимое списочного массива sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
