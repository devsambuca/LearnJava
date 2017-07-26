package main.java.net.proselyte.javase.chapter18;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
/**
 * @author Fominykh Vladimir
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // создать хеш-отображение
        HashMap <String, Double> hm = new HashMap<String, Double>();

        // ввести элементы в хэш-отображение
        hm.put("Джон Доу", new Double(3434.34));
        hm.put("Том Смит", new Double(123.22));
        hm.put("Джен Бейкер", new Double(1378.00));
        hm.put("Тод Холл", new Double(99.22));
        hm.put("Ральф Смит", new Double(-19.08));

        // получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Внести сумму 1000 на чет Джона Доу
        double balance = hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + hm.get("Джон Доу"));
    }
}
