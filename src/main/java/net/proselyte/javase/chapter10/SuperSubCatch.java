package main.java.net.proselyte.javase.chapter10;

/**
 * @author Fominykh Vladimir
 */
/*Эта программа содержит ощибку.

В последовательности операторов catch подкласс исключений
должен быть указан перед его суперклассом, иначе это приведет
к недопостимому коду и ошибке во время компиляции.*/
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
        /*Этот оператор catch вообщее не будет достигнут, т.к.
        подкласс ArithmeticException является производным
        от класса Exception.*/
        catch (Exception e ) { // ОШИБКА: недостижимый код!
            System.out.println("Этот код вообще недостижим.");

        }
    }
}
