package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 *
 * Продемонстрировать применение массивов объекта String
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for( int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
