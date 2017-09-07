package main.java.net.proselyte.javase.chapter10;

/**
 * @author Fominykh Vladimir
 *         <p>
 *         продемонстрировать многократный перехват
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int vals[] = {1, 2, 3};

        try {
            int result = a / b;     // Сгенерировать исключение
                                    // типа ArithmeticException
             vals[10] = 19;         // сгенерировать исключение
                                    // типа ArrayIndexOutBoundsException

            // В этом операторе catch перехватываются оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }

}
