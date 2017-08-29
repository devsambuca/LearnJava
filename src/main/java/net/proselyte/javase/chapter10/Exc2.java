package main.java.net.proselyte.javase.chapter10;

import com.sun.deploy.panel.AbstractRadioPropertyGroup;

/**
 * @author Fominykh Vladimir
 */
public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            // перехватить ошибку деление на ноль
            System.out.println("Деление на ноль.");
        }
        System.out.println("После оператора catch.");
    }
}
