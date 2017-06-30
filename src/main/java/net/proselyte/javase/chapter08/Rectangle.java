package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 */
public class Rectangle extends Figure {
    Rectangle (double a, double b) {
        super(a, b);
    }

    //переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;

    }
}
