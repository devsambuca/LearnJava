package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominykh Vladimir
 *
 * В программе применяется метод с параметрами
 */
public class Box {

    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
    }
}
