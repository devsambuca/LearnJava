package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */

// продемонстрировать порядок вызова конструкторов
public class A {
    A() {
        System.out.println("B конструкторе A");
    }






// 3)    int i;



//  2)  int i;          // этот член открыт по умолчанию,
//    private int j;  // а этот член закрыт в классе A
//
//    void setij (int x, int y) {
//        i = x;
//        j = y;




// 1)    int i, j;
//
//    void showij() {
//        System.out.println("i и j: " + i + "." + j);
//    }
}
