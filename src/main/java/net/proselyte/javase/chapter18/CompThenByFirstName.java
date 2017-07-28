package main.java.net.proselyte.javase.chapter18;
import java.util.*;

// Отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковы
/**
 * @author Fominykh Vladimir
 */
public class CompThenByFirstName implements Comparator<String> {
    public int compare (String aStr, String bStr){
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
