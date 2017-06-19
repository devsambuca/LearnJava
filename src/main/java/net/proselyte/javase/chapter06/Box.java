package main.java.net.proselyte.javase.chapter06;

/**
 * @author Fominykh Vladimir
 *
 * В программе применяется метод с параметрами
 */

 class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


/*
    BoxDemo6

public class Box {

    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и вовратить объем
    double volume() {
        return width * height * depth;
    }
*/
/*
    BoxDemo5

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

*/

