package main.java.net.proselyte.javase.chapter18;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */

// Использовать компаратор для сортировки счетов по фамилиям вкладчиков
// сравнить последние слова в обеих символьных строках
public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    // переопределить метод equals() не требуется
}
