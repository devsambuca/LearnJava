package main.java.net.proselyte.javase.chapter07;

/**
 * @author Fominykh Vladimir
 *
 * Определить внутренний класс в цикле for
 */
public class Outer {
    int outer_x = 100;
    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();



// 2) Продемонстрировать применение внутреннего класса
//    int outer_x = 100;
//
//    void test() {
//        Inner inner = new Inner();
//        inner.display();
//    }
//
//    // это внутренний класс
//    class Inner {
//        void display() {
//            System.out.println("вывод: outer_x = " + outer_x);









// 1)
//            int y = 10; // y - локальная переменная класса Inner
//
//        void display() {
//            System.out.println("вывод: outer_x = " + outer_x);
//        }
//    }
//
//    void showy() {
//        System.out.println(y); // ошибка, здесь переменная y недоступна

        }
    }
}
