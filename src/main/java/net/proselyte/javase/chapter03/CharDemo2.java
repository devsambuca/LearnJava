package main.java.net.proselyte.javase.chapter03;

/**
 * @author Fominykh Vladimir
 *
 * Символьные переменные ведут себя как целочисленные значения
 */
public class CharDemo2 {
    public static void main(String[] args) {
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        ch1++; // увеличение на единицу значение переменной ch1
        System.out.println("ch1 теперь содержит " + ch1);
    }
}
