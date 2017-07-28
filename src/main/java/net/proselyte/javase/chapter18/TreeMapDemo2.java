package main.java.net.proselyte.javase.chapter18;
import java.util.*;
/**
 * @author Fominykh Vladimir
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        //Ввести элементы в древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Том Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новы1й остаток на счете Джона Доу: " + tm.get("Джон Доу"));


    }
}
