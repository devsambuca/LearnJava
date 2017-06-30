package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */

public class B extends A {
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // перегрузить метод show()
    void show(String msg) {

        System.out.println(msg + k);
    }

//   6) }  int k;
//    B(int a, int b, int c){
//        super(a, b);
//        k = c;
//    }
//
//    // вывести содержимое переменной k с помощью метода,
//    // переопределяющего метод show() из класса A
//
//    void show() {
//        super.show(); // здесь вызывается метод show() из класса A
//        System.out.println("k: " + k);
//    }





//  5) int k;
//    B(int a, int b, int c){
//        super(a, b);
//        k = c;
//    }
//
//    // вывести содержимое переменной k с помощью метода,
//    // переопределяющего метод show() из класса A
//
//    void show() {
//        System.out.println("k: " + k);
//    }



//// создать подкласс путем вызова расширения класса A
// 4)
//public class B extends A {
//    B() {
//        System.out.println("B конструкторе B.");
//    }


// Член j класса A в этом классе недоступен
// 3)   int i; // Этот член i скрывает член i из класса A
//
//    B (int a, int b) {
//        super.i = a; //член i из класса A
//        i = b;
//    }
//    void show() {
//        System.out.println("Член i в суперклассе: " + super.i);
//        System.out.println("Член i В подклассе: " + i);
//
//    }

// 2)   int total;
//
//    void sum() {
//        total = i + j; //ОШИБКА: член j в этом классе недоступен
//    }


// 1)   int k;
//
//    void showk() {
//        System.out.println("k: " + k);
//    }
//    void sum() {
//        System.out.println("i + j + k: " +(i + j + k));
//    }
}
