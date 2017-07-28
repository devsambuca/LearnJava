package main.java.net.proselyte.javase.chapter18;

import java.util.*;
// Использовать метод thenComparing() для сортировки
// счетов вкладчиков сначала по фамилии, а затем по имени
/**
 * @author Fominykh Vladimir
 */
public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
