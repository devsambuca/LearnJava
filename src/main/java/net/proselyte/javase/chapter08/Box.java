package main.java.net.proselyte.javase.chapter08;

/**
 * @author Fominykh Vladimir
 *
 * В этой программе наследование применятся
 * для расщирения класса Box
 */
public class Box {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех радзмеров
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box () {
        width = -1;     // значение -1 служит для обозначения
        height = -1;    // неинициализированного
        depth = -1;     // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
