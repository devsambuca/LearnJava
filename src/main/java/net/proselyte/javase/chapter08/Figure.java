package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */

//Применение абстрактных методов и классов
abstract public class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}






//1 пример
//public class Figure {
//
//    double dim1;
//    double dim2;
//
//    Figure(double a, double b) {
//        dim1 = a;
//        dim2 = b;
//    }
//
//    double area() {
//        System.out.println("Площадь фигуры не определена.");
//        return 0;
//    }
//}
